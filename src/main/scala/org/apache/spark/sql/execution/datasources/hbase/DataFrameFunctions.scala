package org.apache.spark.sql.execution.datasources.hbase

import org.apache.hadoop.conf.Configuration
import org.apache.hadoop.fs.Path
import org.apache.hadoop.hbase.client.{Connection, ConnectionFactory, Put, Result}
import org.apache.hadoop.hbase.io.ImmutableBytesWritable
import org.apache.hadoop.hbase.mapreduce.{HFileOutputFormat2, TableOutputFormat}
import org.apache.hadoop.hbase.tool.LoadIncrementalHFiles
import org.apache.hadoop.hbase.{HBaseConfiguration, KeyValue, TableName}
import org.apache.hadoop.mapred.JobConf
import org.apache.hadoop.mapreduce.Job
import org.apache.hadoop.security.UserGroupInformation
import org.apache.spark.internal.Logging
import org.apache.spark.sql.{DataFrame, Row}
import org.json4s.DefaultFormats

import scala.collection.immutable.HashMap

class DataFrameFunctions(data: DataFrame) extends Logging with Serializable {

  def getConnection(hbaseConf: Configuration, options: Map[String, String]): Connection = {
    System.setProperty("java.security.krb5.conf", hbaseConf.get("java.security.krb5.conf", "/etc/krb5.conf"))
    System.setProperty("sun.security.krb5.debug", hbaseConf.get("sun.security.krb5.debug", "false"))
    if ("kerberos".equals(hbaseConf.get("hbase.security.authorization"))) {
      UserGroupInformation.setConfiguration(hbaseConf)
      UserGroupInformation.loginUserFromKeytab(hbaseConf.get("hbase.kerberos.principal"), hbaseConf.get("hbase.kerberos.keytab"))
    }
    ConnectionFactory.createConnection(hbaseConf)
  }

  def saveToHbase(tableName: String,
                  options: Map[String, String] = new HashMap[String, String]): Unit = {

    val hbaseConf = {
      implicit val formats: DefaultFormats.type = DefaultFormats
      val hc = HBaseConfiguration.create()

      options.foreach(p => hc.set(p._1, p._2))
      data.sparkSession.conf.getAll.filter(_._1.toLowerCase.contains("hbase")).foreach(p => hc.set(p._1, p._2))

      ConfUtil.init(hc, options)
    }

    val rowkey = options.getOrElse("hbase.table.rowkey.field", data.schema.head.name)
    require(data.schema.fields.map(_.name).contains(rowkey), "No field name named " + rowkey)
    log.warn("The rowkey field name is " + rowkey)
    if (!options.contains("hbase.table.rowkey.field")) log.warn("The hbase.table.rowkey.field is not set, and the first field is rowkey as the default `" + data.schema.head.name + "`")
    val family = options.getOrElse("hbase.table.family", "info")
    if (!options.contains("hbase.table.family")) log.warn("The hbase.table.family is not set, use the default family is `info`")
    val numReg = options.getOrElse("hbase.table.split.regions", "-1").toInt
    val regionSplits = options.getOrElse("hbase.table.split.list", "")
    val splitRadix = options.getOrElse("hbase.table.split.radix", "16").toInt
    val startKey = options.getOrElse("hbase.table.split.startKey", options.getOrElse("hbase.table.split.startKey", null))
    val endKey = options.getOrElse("hbase.table.split.endKey", options.getOrElse("hbase.table.split.endKey", null))

    val rdd = data.rdd
    val f = family

    if (options.getOrElse("hbase.table.check", "false").toBoolean) {
      val tName = TableName.valueOf(tableName)
      val connection = getConnection(hbaseConf, options)
      val admin = connection.getAdmin
      if (!admin.isTableAvailable(tName)) {
        HBaseUtils.createTable(connection, tName, family, startKey, endKey, splitRadix, numReg, regionSplits)
      }
      connection.close()
    }
    if (hbaseConf.get("mapreduce.output.fileoutputformat.outputdir") == null) {
      hbaseConf.set("mapreduce.output.fileoutputformat.outputdir", "/tmp")
    }
    val jobConf = new JobConf(hbaseConf, this.getClass)
    jobConf.set(TableOutputFormat.OUTPUT_TABLE, tableName)

    val job = Job.getInstance(jobConf)
    job.setOutputKeyClass(classOf[ImmutableBytesWritable])
    job.setOutputValueClass(classOf[Result])
    job.setOutputFormatClass(classOf[TableOutputFormat[ImmutableBytesWritable]])

    val fields = data.schema.toArray
    val rowkeyField = fields.zipWithIndex.filter(f => f._1.name == rowkey).head
    val otherFields = fields.zipWithIndex.filter(f => f._1.name != rowkey)

    lazy val rowkeySetter = HBaseUtils.makeRowkeySetter(rowkeyField)
    lazy val setters = otherFields.map(r => HBaseUtils.makeHbaseSetter(r))
    lazy val setters_bulkload =
      otherFields.sortBy(_._1.name).map(r => HBaseUtils.makeHbaseSetter_bulkload(r))

    options.getOrElse("bulkload.enable", "false") match {

      case "true" =>
        val tmpPath = s"/tmp/bulkload/$tableName" + System.currentTimeMillis()

        def convertToPut_bulkload(row: Row) = {
          val rk = rowkeySetter.apply(row)
          setters_bulkload.map(_.apply(rk, row, f))
        }

        rdd.flatMap(convertToPut_bulkload)
          .saveAsNewAPIHadoopFile(tmpPath, classOf[ImmutableBytesWritable], classOf[KeyValue], classOf[HFileOutputFormat2], job.getConfiguration)

        val conn = getConnection(hbaseConf, options)
        val table = conn.getTable(TableName.valueOf(tableName))
        val regionLocator = conn.getRegionLocator(TableName.valueOf(tableName))
        val bulkLoader = new LoadIncrementalHFiles(hbaseConf)
        bulkLoader.doBulkLoad(new Path(tmpPath), conn.getAdmin, table, regionLocator)


      case "false" =>
        def convertToPut(row: Row) = {
          val put = new Put(rowkeySetter.apply(row))
          setters.foreach(_.apply(put, row, f))
          (new ImmutableBytesWritable, put)
        }

        rdd.map(convertToPut).saveAsNewAPIHadoopDataset(job.getConfiguration)
    }
  }
}