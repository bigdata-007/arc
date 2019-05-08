package net.bigdata007.arc.adapter

import net.bigdata007.arc.antlr4.ArcSQLParser
import net.bigdata007.arc.arc._
import net.bigdata007.arc.util._
import net.bigdata007.arc.udf.{ScalaSourceUDAF, ScalaSourceUDF}
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.catalyst.FunctionIdentifier
import org.apache.spark.sql.catalyst.analysis.FunctionRegistry.FunctionBuilder
import org.apache.spark.sql.catalyst.expressions.{Expression, ScalaUDF}
import org.apache.spark.sql.execution.aggregate.ScalaUDAF
import org.apache.spark.sql.expressions.UserDefinedAggregateFunction

import scala.collection.mutable
import scala.util.Try

class Register(sparkSession: SparkSession) extends Adapter[ArcSQLParser.RegisterUdfContext] {

  def scalaSourceFunctionBuilder(udfName: String, func: String): FunctionBuilder = {
    val superClassName = ClassCreateUtils(func).clazz
    if (superClassName.equals(classOf[UserDefinedAggregateFunction].getName)) {
      e: Seq[Expression] => ScalaUDAF(e, ScalaSourceUDAF(func))
    } else {
      val (rf, argumentTypes, returnType) = ScalaSourceUDF(func)
      val inputTypes = Try(argumentTypes.toList).toOption
      e: Seq[Expression] => ScalaUDF(rf, returnType, e, e.map(_ => true), inputTypes.getOrElse(Nil), Some(udfName))
    }
  }

  def parse(udfName: String, func: String, options: mutable.Map[String, String]): Unit = {
    ArcUdfContext.put[ClassInfo](udfName, ClassCreateUtils(func))
    val udf = scalaSourceFunctionBuilder(udfName, func)
    sparkSession.sessionState.functionRegistry.registerFunction(FunctionIdentifier(udfName), udf)
  }

  override def execute(ctx: ArcSQLParser.RegisterUdfContext): Unit = {
    val func: String = ctx.func().content.getText.clearSymbol()
    val udfName: String = ctx.from.table.getText.clearSymbol()
    val options = Antlr4Util.fillBooleanDefaultExpression(ctx)
    parse(
      udfName,
      func.replaceSet(),
      options.map(x => (x._1, x._2.replaceSet()))
    )
  }

}
