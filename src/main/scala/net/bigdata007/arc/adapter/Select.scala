package net.bigdata007.arc.adapter

import java.util.UUID
import java.util.concurrent.ConcurrentHashMap

import net.bigdata007.arc.antlr4.{ArcSQLLexer, ArcSQLParser}
import net.bigdata007.arc.util._
import org.antlr.v4.runtime.misc.Interval
import org.apache.spark.sql.types._
import org.apache.spark.sql.{DataFrame, Row, SparkSession}
import net.bigdata007.arc.arc._

import scala.collection.mutable

class Select(sparkSession: SparkSession) extends Adapter[ArcSQLParser.StatementDefaultContext] with Serializable {

  val results = new ConcurrentHashMap[String, String]()

  def registerSparkTableSchema(sparkTableSchema: String): StructType = {
    StructType(
      sparkTableSchema.split("=>").map(field =>
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

  def batchOptimize(df: DataFrame): DataFrame = {
    val schemas = df.schema
    val fields = schemas.fields
    val defaultUdfStylePattern = "UDF:(.*)[(].*".r
    var batchFields = Map[Int, ClassInfo]()
    fields.indices.foreach {
      //check is default udf style
      index =>
        var classInfo: ClassInfo = null
        val hasUdf = fields(index).name match {
          case defaultUdfStylePattern(udfName) =>
            classInfo = ArcUdfContext.get(udfName)
            ArcUdfContext.all().keySet.contains(udfName)
          case _ => false
        }
        if (hasUdf && classInfo.methods.contains("batch")) {
          //check batch operator
          batchFields += (index -> classInfo)
        }
    }
    if (batchFields.nonEmpty) {
      val serialBatchFields = batchFields.map(x => (x._1, x._2.func))
      val newDF = df.rdd.mapPartitions {
        rows => {
          val newInitFields = serialBatchFields.map(x => (x._1, ClassCreateUtils(x._2)))
          newInitFields.foreach(x =>
            if (x._2.methods.contains("setup")) {
              x._2.methods("setup").invoke(x._2.instance)
            }
          )
          rows
            .grouped(1000)
            .flatMap {
              batch => {
                var _batch: Seq[Row] = batch
                try {
                  val bat = newInitFields.map {
                    kv => {
                      (kv._1, kv._2.methods("batch").invoke(kv._2.instance, batch.map(row => row.get(kv._1))).asInstanceOf[Seq[_]])
                    }
                  }
                  _batch = _batch.indices.map(index => {
                    val obj = _batch(index)
                    val arr = batch.head.schema.indices
                      .map(x => obj.get(x))
                      .toArray
                    bat.foreach {
                      b => {
                        arr(b._1) = b._2(index)
                      }
                    }
                    Row.fromSeq(arr)
                  })
                } catch {
                  case e: Exception =>
                    e.printStackTrace()
                    e.getStackTrace.foreach(x => logError(x.toString))
                    logError(s"${e.getStackTrace.head}")
                    _batch = Seq[Row]()
                }
                _batch
              }
            }
        }
      }
      sparkSession.createDataFrame(newDF, schemas)
    } else df

  }

  def parse(sqlText: String, tableName: String): Unit = {
    val df = batchOptimize(sparkSession
      .sql(sqlText))
    df.createTempView(tableName)
  }

  override def execute(ctx: ArcSQLParser.StatementDefaultContext): Unit = {
    val input = ctx.start.getTokenSource.asInstanceOf[ArcSQLLexer]._input
    val start = ctx.start.getStartIndex
    val stop = ctx.stop.getStopIndex
    val interval = new Interval(start, stop)
    val originalText = input.getText(interval).replaceSet()
    var tableName = ""
    val chunks = originalText.split("\\s+")
    if (chunks(chunks.length - 2).equals("as")) tableName = chunks.last.replace(";", "").trim
    val sql = originalText.replaceAll(s"as[\\s|\\n]+$tableName", "")
    if (tableName.equals("") || tableName.endsWith(")")) {
      tableName = UUID.randomUUID().toString.replace("-", "")
      ArcContext.get[mutable.Set[String]]("arc_showTables").add(tableName)
    }
    parse(sql, tableName)
    results.put("tableName", tableName)
  }

}
