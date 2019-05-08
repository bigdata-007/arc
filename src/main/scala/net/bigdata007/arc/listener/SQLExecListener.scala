package net.bigdata007.arc.listener

import net.bigdata007.arc.adapter._
import net.bigdata007.arc.antlr4.{ArcSQLBaseListener, ArcSQLParser}
import org.apache.spark.internal.Logging
import org.apache.spark.sql.SparkSession

class SQLExecListener(sparkSession: SparkSession) extends ArcSQLBaseListener with Logging {


  override def exitSetConfiguration(ctx: ArcSQLParser.SetConfigurationContext): Unit = {
    new Set(sparkSession).execute(ctx)
  }

  override def exitLoadTable(ctx: ArcSQLParser.LoadTableContext): Unit = {
    new Load(sparkSession).execute(ctx)
  }

  override def exitRegisterUdf(ctx: ArcSQLParser.RegisterUdfContext): Unit = {
    new Register(sparkSession).execute(ctx)
  }

  override def exitStatementDefault(ctx: ArcSQLParser.StatementDefaultContext): Unit = {
    new Select(sparkSession).execute(ctx)
  }

  override def exitCacheTable(ctx: ArcSQLParser.CacheTableContext): Unit = {
    new Cache(sparkSession).execute(ctx)
  }

  override def exitSaveTable(ctx: ArcSQLParser.SaveTableContext): Unit = {
    new Save(sparkSession).execute(ctx)
  }
}
