package org.apache.spark.sql.execution.datasources.hbase

import java.io.IOException
import java.sql.Timestamp

import org.apache.commons.lang3.StringUtils
import org.apache.hadoop.hbase.client._
import org.apache.hadoop.hbase.io.ImmutableBytesWritable
import org.apache.hadoop.hbase.io.compress.Compression.Algorithm
import org.apache.hadoop.hbase.util.Bytes
import org.apache.hadoop.hbase.{KeyValue, TableName}
import org.apache.spark.internal.Logging
import org.apache.spark.sql.Row
import org.apache.spark.sql.types._
import org.joda.time.DateTime

object HBaseUtils extends Logging {

  case class HBaseTableSchema(cm: String, cel: String)

  case class SparkTableSchema(fieldName: String, fieldType: DataType)


  def createTable(connection: Connection, tName: TableName, family: String, startKey: String, endKey: String, radix: Int, numReg: Int, regionSplits: String) {
    if (StringUtils.isNotBlank(regionSplits)) {
      HBaseUtils.createTable(connection, tName, getSplitsByStrs(regionSplits), family)
    } else if (numReg != -1) {
      HBaseUtils.createTable(connection, tName, getSplits(numReg, radix, startKey, endKey).map(Bytes.toBytes), family)
    } else {
      var admin: Admin = null
      try {
        admin = connection.getAdmin
        if (!admin.isTableAvailable(tName)) {
          val tableDesc = TableDescriptorBuilder.newBuilder(tName)
          val cf = ColumnFamilyDescriptorBuilder.newBuilder(Bytes.toBytes(family)).build()
          tableDesc.setColumnFamily(cf)
          admin.createTable(tableDesc.build())
        }
      } finally if (admin != null) admin.close()

    }
  }

  @throws[IOException]
  def createTable(connection: Connection, tableName: TableName, hexSplits: Array[Array[Byte]], columnFamilies: String*): Unit = {
    var admin: Admin = null
    try {
      admin = connection.getAdmin
      if (admin.tableExists(tableName)) log.warn("table:{} exists!", tableName.getName)
      else {
        val tableDescriptor = TableDescriptorBuilder.newBuilder(tableName)
        for (columnFamily <- columnFamilies) {
          val columnDescriptor = ColumnFamilyDescriptorBuilder.newBuilder(Bytes.toBytes(columnFamily))
          columnDescriptor.setCompressionType(Algorithm.SNAPPY)
          val ttl = connection.getConfiguration.get("hbase.cf.ttl")
          if (ttl != null) {
            columnDescriptor.setTimeToLive(Integer.valueOf(ttl))
          }
          tableDescriptor.setColumnFamily(columnDescriptor.build())
        }
        admin.createTable(tableDescriptor.build(), hexSplits)
        log.info("create table:{} success!", tableName.getName)
      }
    } finally if (admin != null) admin.close()
  }

  implicit val formats = org.json4s.DefaultFormats

  def getSplitsByStrs(splits: String): Array[Array[Byte]] = splits.split(",", -1).map(Bytes.toBytes)


  /**
    * Hbase paration convert
    *
    * @param region Hbase regionServer node numbers
    * @param radix   10 | 16
    * @param start  begin => for：00
    * @param end    end => for：ff
    * @return Array
    */
  def getSplits(region: Int, radix: Int, start: String, end: String): Array[String] = {
    val range = start.toInt to java.lang.Long.valueOf(end, radix).toInt
    range
      .filter(_ % (range.size / region) == 0)
      .map(if (radix == 16) Integer.toHexString else _.toString)
      .tail
      .toArray
  }

  /**
    * get hbase schema
    */
  def registerHbaseTableSchema(sparkTableSchema: String): Seq[HBaseTableSchema] = {
    sparkTableSchema.split(",").map(field =>
      field.split(":") match {
        case Array(cf, cel) =>
          HBaseTableSchema(cf, cel)
      }
    )
  }

  def registerSparkTableSchema(sparkTableSchema: String): StructType = {
    StructType(
      sparkTableSchema.split(",").map(field =>
        field.split(":") match {
          case Array(fieldName, type_) =>
            val fieldType = type_.toLowerCase match {
              case "long" => LongType
              case "float" => FloatType
              case "double" => DoubleType
              case "integer" => IntegerType
              case "int" => IntegerType
              case "boolean" => BooleanType
              case "binary" => BinaryType
              case "timestamp" => TimestampType
              case "datetype" => DateType
              case _ => StringType
            }
            StructField(fieldName, fieldType)
        }
      )
    )
  }

  type HBaseValueGetter = Result => Any

  def makeHbaseGetter(dataType: (SparkTableSchema, HBaseTableSchema)): HBaseValueGetter = {
    val (sparkSchema, hbaseSchema) = dataType
    sparkSchema.fieldType match {
      case LongType =>
        (result: Result) =>
          try {
            Bytes.toLong(result.getValue(hbaseSchema.cm.getBytes, hbaseSchema.cel.getBytes))
          } catch {
            case _: Exception => 0L
          }
      case FloatType =>
        (result: Result) => Bytes.toFloat(result.getValue(hbaseSchema.cm.getBytes, hbaseSchema.cel.getBytes))
      case DoubleType =>
        (result: Result) => Bytes.toDouble(result.getValue(hbaseSchema.cm.getBytes, hbaseSchema.cel.getBytes))
      case IntegerType =>
        (result: Result) =>
          Bytes.toInt(result.getValue(hbaseSchema.cm.getBytes, hbaseSchema.cel.getBytes))
      case BooleanType =>
        (result: Result) =>
          Bytes.toBoolean(result.getValue(hbaseSchema.cm.getBytes, hbaseSchema.cel.getBytes))
      case BinaryType =>
        (result: Result) =>
          result.getValue(hbaseSchema.cm.getBytes, hbaseSchema.cel.getBytes)
      case TimestampType =>
        (result: Result) =>
          new Timestamp(Bytes.toLong(result.getValue(hbaseSchema.cm.getBytes, hbaseSchema.cel.getBytes)))
      case DateType =>
        (result: Result) =>
          new java.sql.Date(Bytes.toLong(result.getValue(hbaseSchema.cm.getBytes, hbaseSchema.cel.getBytes)))
      case _ =>
        (result: Result) =>
          if (hbaseSchema.cm.equals("")) {
            Bytes.toString(result.getRow)
          } else {
            Bytes.toString(result.getValue(hbaseSchema.cm.getBytes, hbaseSchema.cel.getBytes))
          }
    }
  }

  type HBaseRowkeySetter = Row => Array[Byte]

  def makeRowkeySetter(dataType: (StructField, Int)): HBaseRowkeySetter = {
    val (structField, index) = dataType
    structField.dataType match {
      case StringType =>
        (row: Row) => Bytes.toBytes(row.getString(index))
      case LongType =>
        (row: Row) => Bytes.toBytes(row.getLong(index))
      case FloatType =>
        (row: Row) => Bytes.toBytes(row.getFloat(index))
      case DoubleType =>
        (row: Row) => Bytes.toBytes(row.getDouble(index))
      case IntegerType =>
        (row: Row) => Bytes.toBytes(row.getInt(index))
      case BooleanType =>
        (row: Row) => Bytes.toBytes(row.getBoolean(index))
      case DateType =>
        (row: Row) => Bytes.toBytes(new DateTime(row.getDate(index)).getMillis)
      case TimestampType =>
        (row: Row) => Bytes.toBytes(new DateTime(row.getTimestamp(index)).getMillis)
      case BinaryType =>
        (row: Row) => row.getAs[Array[Byte]](index)
      case _ =>
        (row: Row) => Bytes.toBytes(row.getString(index))
    }
  }

  type HBaseValueSetter = (Put, Row, String) => Unit

  def makeHbaseSetter(dataType: (StructField, Int)): HBaseValueSetter = {
    val (structField, index) = dataType
    structField.dataType match {
      case StringType =>
        (put: Put, row: Row, cm: String) =>
          if (row.getString(index) == null) put.addColumn(Bytes.toBytes(cm), Bytes.toBytes(structField.name), Bytes.toBytes(""))
          else put.addColumn(Bytes.toBytes(cm), Bytes.toBytes(structField.name), Bytes.toBytes(row.getString(index)))
      case LongType =>
        (put: Put, row: Row, cm: String) =>
          put.addColumn(Bytes.toBytes(cm), Bytes.toBytes(structField.name), Bytes.toBytes(row.getLong(index)))
      case FloatType =>
        (put: Put, row: Row, cm: String) =>
          put.addColumn(Bytes.toBytes(cm), Bytes.toBytes(structField.name), Bytes.toBytes(row.getFloat(index)))
      case DoubleType =>
        (put: Put, row: Row, cm: String) =>
          put.addColumn(Bytes.toBytes(cm), Bytes.toBytes(structField.name), Bytes.toBytes(row.getDouble(index)))
      case IntegerType =>
        (put: Put, row: Row, cm: String) =>
          put.addColumn(Bytes.toBytes(cm), Bytes.toBytes(structField.name), Bytes.toBytes(row.getInt(index)))
      case BooleanType =>
        (put: Put, row: Row, cm: String) =>
          put.addColumn(Bytes.toBytes(cm), Bytes.toBytes(structField.name), Bytes.toBytes(row.getBoolean(index)))
      case DateType =>
        (put: Put, row: Row, cm: String) =>
          put.addColumn(Bytes.toBytes(cm), Bytes.toBytes(structField.name), Bytes.toBytes(new DateTime(row.getDate(index)).getMillis))
      case TimestampType =>
        (put: Put, row: Row, cm: String) =>
          put.addColumn(Bytes.toBytes(cm), Bytes.toBytes(structField.name), Bytes.toBytes(new DateTime(row.getTimestamp(index)).getMillis))
      case BinaryType =>
        (put: Put, row: Row, cm: String) =>
          put.addColumn(Bytes.toBytes(cm), Bytes.toBytes(structField.name), row.getAs[Array[Byte]](index))
      case _ =>
        (put: Put, row: Row, cm: String) =>
          put.addColumn(Bytes.toBytes(cm), Bytes.toBytes(structField.name), Bytes.toBytes(row.getString(index)))
    }
  }

  type HBaseValueSetter_bulkload = (Array[Byte], Row, String) => (ImmutableBytesWritable, KeyValue)

  def makeHbaseSetter_bulkload(dataType: (StructField, Int)): HBaseValueSetter_bulkload = {
    val (structField, index) = dataType
    structField.dataType match {
      case StringType =>
        (rk: Array[Byte], row: Row, cm: String) =>
          if (row.getString(index) != null) (new ImmutableBytesWritable(rk), new KeyValue(rk, cm.getBytes(), structField.name.getBytes(), Bytes.toBytes(row.getString(index))))
          else (new ImmutableBytesWritable(rk), new KeyValue(rk, cm.getBytes(), structField.name.getBytes()))
      case LongType =>
        (rk: Array[Byte], row: Row, cm: String) =>
          (new ImmutableBytesWritable(rk), new KeyValue(rk, cm.getBytes(), structField.name.getBytes(), Bytes.toBytes(row.getLong(index))))
      case FloatType =>
        (rk: Array[Byte], row: Row, cm: String) =>
          (new ImmutableBytesWritable(rk), new KeyValue(rk, cm.getBytes(), structField.name.getBytes(), Bytes.toBytes(row.getFloat(index))))
      case DoubleType =>
        (rk: Array[Byte], row: Row, cm: String) =>
          (new ImmutableBytesWritable(rk), new KeyValue(rk, cm.getBytes(), structField.name.getBytes(), Bytes.toBytes(row.getDouble(index))))
      case IntegerType =>
        (rk: Array[Byte], row: Row, cm: String) =>
          (new ImmutableBytesWritable(rk), new KeyValue(rk, cm.getBytes(), structField.name.getBytes(), Bytes.toBytes(row.getInt(index))))
      case BooleanType =>
        (rk: Array[Byte], row: Row, cm: String) =>
          (new ImmutableBytesWritable(rk), new KeyValue(rk, cm.getBytes(), structField.name.getBytes(), Bytes.toBytes(row.getBoolean(index))))
      case DateType =>
        (rk: Array[Byte], row: Row, cm: String) =>
          (new ImmutableBytesWritable(rk), new KeyValue(rk, cm.getBytes(), structField.name.getBytes(), Bytes.toBytes(new DateTime(row.getDate(index)).getMillis)))
      case TimestampType =>
        (rk: Array[Byte], row: Row, cm: String) =>
          (new ImmutableBytesWritable(rk), new KeyValue(rk, cm.getBytes(), structField.name.getBytes(), Bytes.toBytes(new DateTime(row.getTimestamp(index)).getMillis)))
      case BinaryType =>
        (rk: Array[Byte], row: Row, cm: String) =>
          (new ImmutableBytesWritable(rk), new KeyValue(rk, cm.getBytes(), structField.name.getBytes(), row.getAs[Array[Byte]](index)))
      case _ =>
        (rk: Array[Byte], row: Row, cm: String) =>
          (new ImmutableBytesWritable(rk), new KeyValue(rk, cm.getBytes(), structField.name.getBytes(), Bytes.toBytes(row.getString(index))))
    }
  }
}
