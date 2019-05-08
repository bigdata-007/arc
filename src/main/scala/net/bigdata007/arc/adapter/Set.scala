package net.bigdata007.arc.adapter

import net.bigdata007.arc.antlr4.{ArcSQLBaseVisitor, ArcSQLLexer, ArcSQLParser}
import net.bigdata007.arc.util.{Antlr4Util, ArcContext}
import org.apache.spark.sql.SparkSession
import net.bigdata007.arc.arc._
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}
import org.apache.spark.sql.functions.col

import scala.collection.mutable
import scala.collection.JavaConverters._

class Set(sparkSession: SparkSession) extends Adapter[ArcSQLParser.SetConfigurationContext] {

  def execSql(sqlText: String, options: mutable.HashMap[String, String]): String = {
    val loadLexer = new ArcSQLLexer(CharStreams.fromString(sqlText))
    val tokens = new CommonTokenStream(loadLexer)
    val parser = new ArcSQLParser(tokens)
    val ctx = parser.multiStatement()
    val select = new Select(sparkSession)
    val visitor = new ArcSQLBaseVisitor[Unit] {
      override def visitLoadTable(ctx: ArcSQLParser.LoadTableContext): Unit = {
        new Load(sparkSession).execute(ctx)
      }

      override def visitStatementDefault(ctx: ArcSQLParser.StatementDefaultContext): Unit = {
        select.execute(ctx)
      }

      override def visitRegisterUdf(ctx: ArcSQLParser.RegisterUdfContext): Unit = {
        new Register(sparkSession).execute(ctx)
      }

      override def visitCacheTable(ctx: ArcSQLParser.CacheTableContext): Unit = {
        new Cache(sparkSession).execute(ctx)
      }
    }
    visitor.visit(ctx)
    val showTable = sparkSession.table(select.results.get("tableName"))
    val column = showTable.columns.map(col).head
    showTable.limit(1).select(column).collect().head.apply(0).toString
  }

  override def execute(context: ArcSQLParser.SetConfigurationContext): Unit = {
    context.sets().asScala.foreach(child => {
      val options = new mutable.HashMap[String, String]()
      if (child.where != null) {
        Antlr4Util.getChild(child.booleanExpression(), options)
      }
      val setType = options.getOrElse("type", "")
      import scala.sys.process._
      var result: String = setType.clearSymbol() match {
        case "shell" => child.content.getText.clearSymbol().!!
        case "" => child.content.getText.clearSymbol()
        case "sql" => execSql(child.content.getText.clearSymbol(), options)
        case default@_ => throw sys.error(s"$default type not suport.")
      }
      if ("true".equals(options.getOrElse("trim", "false"))) {
        result = result.trim
      }
      ArcContext
        .get[mutable.Map[String, String]]("arc_set")
        .put(child.name.getText.clearSymbol(), result)
    })
  }
}
