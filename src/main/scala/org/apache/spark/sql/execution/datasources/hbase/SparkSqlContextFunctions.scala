package org.apache.spark.sql.execution.datasources.hbase

import java.sql.Timestamp
import java.util

import net.bigdata007.arc.util.ClassCreateUtils
import org.apache.commons.lang3.StringUtils
import org.apache.hadoop.hbase.HBaseConfiguration
import org.apache.hadoop.hbase.client.{Get, Result}
import org.apache.hadoop.hbase.io.ImmutableBytesWritable
import org.apache.hadoop.hbase.mapreduce.TableInputFormat
import org.apache.hadoop.hbase.util.Bytes
import org.apache.spark.sql.execution.datasources.hbase.HBaseUtils.SparkTableSchema
import org.apache.spark.sql.types._
import org.apache.spark.sql.{DataFrame, Row, SparkSession}
import org.apache.spark.util.Utils
import org.json4s.NoTypeHints
import org.json4s.jackson.Serialization

import scala.collection.JavaConverters._
import scala.collection.immutable.HashMap
import scala.collection.mutable.ArrayBuffer

class SparkSqlContextFunctions(@transient val spark: SparkSession) extends Serializable {

  private val SPARK_TABLE_SCHEMA: String = "org.apache.spark.table.schema"
  private val HBASE_TABLE_SCHEMA: String = "hbase.table.schema"
  private var df_rowkey: DataFrame = _

  def rowkey(df_rowkey: DataFrame): SparkSqlContextFunctions = {
    this.df_rowkey = df_rowkey
    this
  }

  def hbaseTableAsDataFrame(table: String, zkUrl: Option[String] = None,
                            options: Map[String, String] = new HashMap[String, String]
                           ): DataFrame = {

    val hbaseConf = {
      val hc = HBaseConfiguration.create()
      hc.set(TableInputFormat.INPUT_TABLE, table)
      val auth = options.get("hbase.security.authorization")
      if (auth.nonEmpty) {
        hc.set("hadoop.security.authentication", auth.get)
      }
      System.setProperty("java.security.krb5.conf", options.getOrElse("java.security.krb5.conf", "/etc/krb5.conf"))

      if (options.contains(HBASE_TABLE_SCHEMA)) {
        var str = ArrayBuffer[String]()
        options(HBASE_TABLE_SCHEMA)
          .split(",", -1).map(field =>
          if (!field.startsWith(":")) {
            str += field
          }
        )
        if (str.length > 1) hc.set(TableInputFormat.SCAN_COLUMNS, str.mkString(" "))
      }

      options.foreach(p => hc.set(p._1, p._2))
      spark.sparkContext.getConf.getAll.filter(_._1.toLowerCase.contains("hbase")).foreach(p => hc.set(p._1, p._2))

      ConfUtil.init(hc, options)
    }

    def schema: StructType = {
      Option(hbaseConf.get(SPARK_TABLE_SCHEMA)) match {
        case Some(schema) => HBaseUtils.registerSparkTableSchema(schema)
        case None =>
          StructType(
            Array(
              StructField("rowkey", StringType, nullable = false),
              StructField("content", StringType)
            )
          )
      }
    }

    val inputFormatName = hbaseConf.get("hbase.tableinputformat", "org.apache.spark.sql.execution.datasources.hbase.TableInputFormat2")
    val inputFormatClass = Utils.getContextOrSparkClassLoader.loadClass(inputFormatName).newInstance().asInstanceOf[TableInputFormat]

    Option(hbaseConf.get(SPARK_TABLE_SCHEMA)) match {
      case Some(s) =>
        require(hbaseConf.get(HBASE_TABLE_SCHEMA).nonEmpty, "Because the parameter org.apache.spark.table.schema has been set, hbase.table.schema also needs to be set.")
        val sparkTableSchemas = schema.fields.map(f => SparkTableSchema(f.name, f.dataType))
        val hBaseTableSchemas = HBaseUtils.registerHbaseTableSchema(hbaseConf.get(HBASE_TABLE_SCHEMA))
        require(sparkTableSchemas.length == hBaseTableSchemas.length, "The length of the parameter org.apache.spark.table.schema must be the same as the parameter hbase.table.schema.")
        val schemas = sparkTableSchemas.zip(hBaseTableSchemas)
        val setters = schemas.map(schema => HBaseUtils.makeHbaseGetter(schema))

        if (df_rowkey != null) {
          val rowkeySetter = HBaseUtils.makeRowkeySetter(df_rowkey.schema.fields.zipWithIndex.head)
          val zk = hbaseConf.get("hbase.zookeeper.quorum").split(",")(0).split(":")
          val hbaseRDD = df_rowkey.rdd.mapPartitions(p => {
            val hTable =  HbaseConnectionUtil(hbaseConf,table)
            val gets = new util.ArrayList[Get]()
            p.foreach(r => {
              gets.add(new Get(rowkeySetter.apply(r)))
            })
            val results = hTable.get(gets)
            hTable.close()
            results.iterator
          }
          ).filter(!_.isEmpty).map { result => Row.fromSeq(setters.map(r => r.apply(result)).toSeq) }
          spark.createDataFrame(hbaseRDD, schema)
        } else {

          var hBaseRDD = spark.sparkContext.newAPIHadoopRDD(hbaseConf, inputFormatClass.getClass, classOf[ImmutableBytesWritable], classOf[Result])
            .map { case (_, result) => Row.fromSeq(setters.map(r => r.apply(result)).toSeq) }
          val mapParStrs = options.getOrElse("hbase.mapParations.code", "")
          val mapParSchema = options.getOrElse("hbase.mapParations.schema", "")
          if (StringUtils.isNotBlank(mapParStrs)) {
            hBaseRDD = hBaseRDD.mapPartitions {
              rows => ClassCreateUtils(mapParStrs).invoke[Iterator[Row]](rows)
            }
          }
          if (StringUtils.isNotBlank(mapParStrs) && StringUtils.isNotBlank(mapParSchema)) {
            spark.createDataFrame(hBaseRDD, HBaseUtils.registerSparkTableSchema(mapParSchema))
          } else {
            spark.createDataFrame(hBaseRDD, schema)
          }
        }

      case None =>
        val hBaseRDD = spark.sparkContext.newAPIHadoopRDD(hbaseConf, inputFormatClass.getClass, classOf[ImmutableBytesWritable], classOf[Result])
          .map { line =>
            val rowKey = Bytes.toString(line._2.getRow)

            implicit val formats = Serialization.formats(NoTypeHints)

            val content = line._2.getMap.navigableKeySet().asScala.flatMap { f =>
              line._2.getFamilyMap(f).asScala.map { c =>
                val columnName = Bytes.toString(f) + ":" + Bytes.toString(c._1)
                options.get("field.type." + columnName) match {
                  case Some(i) =>
                    val value = i match {
                      case "LongType" => Bytes.toLong(c._2)
                      case "FloatType" => Bytes.toFloat(c._2)
                      case "DoubleType" => Bytes.toDouble(c._2)
                      case "IntegerType" => Bytes.toInt(c._2)
                      case "BooleanType" => Bytes.toBoolean(c._2)
                      case "BinaryType" => c._2
                      case "TimestampType" => new Timestamp(Bytes.toLong(c._2))
                      case "DateType" => new java.sql.Date(Bytes.toLong(c._2))
                      case _ => Bytes.toString(c._2)
                    }
                    (columnName, value)
                  case None => (columnName, Bytes.toString(c._2))
                }
              }
            }.toMap

            val contentStr = Serialization.write(content)

            Row.fromSeq(Seq(rowKey, contentStr))
          }
        spark.createDataFrame(hBaseRDD, schema)
    }
  }
}