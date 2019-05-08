package net.bigdata007.arc.util

import net.bigdata007.arc.antlr4.ArcSQLParser._
import net.bigdata007.arc.arc._
import org.antlr.v4.runtime.ParserRuleContext

import scala.collection.mutable
import scala.collection.JavaConverters._

object Antlr4Util {

  def getChild(s: ParserRuleContext, map: mutable.Map[String, String]): Unit = {
    s.children.asScala.foreach {
      case pc: PredicatedContext =>
        map += pc.getChild(0).getChild(0).getText.clearSymbol() -> pc.getChild(0).getChild(2).getText.clearSymbol()
      case bc: BooleanDefaultContext =>
        map += bc.getChild(0).getChild(0).getChild(0).getText.clearSymbol() -> bc.getChild(0).getChild(0).getChild(2).getText.clearSymbol()
      case logic: LogicalBinaryContext =>
        getChild(logic, map)
      case _ =>
    }
  }

  def fillBooleanDefaultExpression(value: StatementContext, options: mutable.Map[String, String] = mutable.Map[String, String]()): mutable.Map[String, String] = {
    value.children.asScala.foreach {
      case s: BooleanExpressionContext =>
        getChild(s, options)
      case _ =>
    }
    options
  }
}
