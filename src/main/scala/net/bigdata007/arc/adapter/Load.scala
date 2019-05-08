package net.bigdata007.arc.adapter

import net.bigdata007.arc.antlr4.ArcSQLParser
import net.bigdata007.arc.arc._
import net.bigdata007.arc.util.Antlr4Util
import org.apache.spark.sql.SparkSession

import scala.collection.mutable

class Load(sparkSession: SparkSession) extends Adapter[ArcSQLParser.LoadTableContext] {

  def parse(format: String, tableName: String, viewName: String, options: mutable.Map[String, String]): Unit = {
    val reader = sparkSession.read.options(options)
    val table = format match {
      case "jdbc" =>
        reader
          .option("dbtable", tableName)
          .format("org.apache.spark.sql.execution.datasources.jdbc2")
          .load()
      case "hbase" =>
        reader
          .option("hbase.table.name", tableName)
          .format("org.apache.spark.sql.execution.datasources.hbase")
          .load()
      case "json" | "csv" | "orc" | "parquet" | "text" =>
        if (options.contains("schema")) {
          reader.schema(options("schema"))
        }
        reader
          .format(format)
          .load()
      case _ => reader.format(format).load()
    }
    table.createTempView(viewName)
  }

  override def execute(ctx: ArcSQLParser.LoadTableContext): Unit = {
    val format: String = ctx.from.db.getText.clearSymbol()
    val viewName: String = ctx.to.getText.clearSymbol()
    val tableName: String = ctx.from.table.getText.clearSymbol()
    val options = Antlr4Util.fillBooleanDefaultExpression(ctx)
    parse(
      format,
      tableName: String,
      viewName,
      options.map(x => (x._1, x._2.replaceSet()))
    )
  }

}
