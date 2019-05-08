package net.bigdata007.arc.adapter

import net.bigdata007.arc.antlr4.{ArcSQLLexer, ArcSQLParser}
import org.antlr.v4.runtime.misc.Interval
import org.apache.spark.sql.SparkSession
import net.bigdata007.arc.arc._

class Cache(sparkSession: SparkSession) extends Adapter[ArcSQLParser.CacheTableContext] {

  override def execute(ctx: ArcSQLParser.CacheTableContext): Unit = {
    val input = ctx.start.getTokenSource.asInstanceOf[ArcSQLLexer]._input
    val start = ctx.start.getStartIndex
    val stop = ctx.stop.getStopIndex
    val interval = new Interval(start, stop)
    val originalText = input.getText(interval)
    sparkSession.sql(originalText.replaceSet())
  }

}
