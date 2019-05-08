package net.bigdata007.arc.adapter

import java.util.UUID

import net.bigdata007.arc.antlr4.ArcSQLParser
import net.bigdata007.arc.arc._
import net.bigdata007.arc.util.Antlr4Util
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.col

import scala.collection.mutable

class Save(sparkSession: SparkSession) extends Adapter[ArcSQLParser.SaveTableContext] {

  def parse(format: String, saveMode: String, fromTable: String, toTable: String, options: mutable.Map[String, String]): Unit = {
    val df = sparkSession.table(fromTable)
    val partitionBy: Array[String] = options.getOrElse("partitionBy", "").split(",").filter(_.nonEmpty)
    val numPartitions: Int = options.getOrElse("numPartitions", "1").toInt
    val column: String = options.getOrElse("column", "")

    val dfColumns = if (column.isEmpty) df.columns else df.columns.filter(_.equals(column))
    options += "savemode" -> saveMode

    val writer = df
      .select(dfColumns.map(col): _*)
      .coalesce(numPartitions)
      .write
      .format(format)
      .partitionBy(partitionBy: _*)
      .options(options)


    format match {
      case "hbase" =>
        writer
          .option("hbase.table.name", toTable)
          .format("org.apache.spark.sql.execution.datasources.hbase")
          .save()
      case "jdbc" =>
        options += "dbtable" -> toTable
        writer
          .format("org.apache.spark.sql.execution.datasources.jdbc2")
          .options(options)
          .save()

      case "json" | "csv" | "orc" | "parquet" | "text" =>
        lazy val tmpPath = "/tmp/arc/output/" + UUID.randomUUID().toString.replace("-", "")
        writer
          .mode(saveMode)
          .save(options.getOrElse("path", {
            val path = tmpPath
            logInfo(s"$format save path => $tmpPath")
            path
          }))
      case _ =>
    }
  }

  override def execute(ctx: ArcSQLParser.SaveTableContext): Unit = {
    val saveMode = ctx.saveModel.getText.clearSymbol()
    val fromTable = ctx.fromTableName.table.getText.clearSymbol()
    val format = ctx.toTableName.db.getText.clearSymbol()
    val toTable = ctx.toTableName.table.getText.clearSymbol()
    val options = Antlr4Util.fillBooleanDefaultExpression(ctx)
    parse(
      format,
      saveMode,
      fromTable,
      toTable,
      options.map(x => (x._1, x._2.replaceSet()))
    )
  }

}
