package net.bigdata007.arc.udf

import net.bigdata007.arc.util.ClassCreateUtils
import org.apache.spark.internal.Logging
import org.apache.spark.sql.Row
import org.apache.spark.sql.expressions.{MutableAggregationBuffer, UserDefinedAggregateFunction}
import org.apache.spark.sql.types.{DataType, StructType}

import scala.reflect.ClassTag

object ScalaSourceUDAF {
  def apply(src: String): UserDefinedAggregateFunction = {
    generateAggregateFunction(src)
  }

  private def generateAggregateFunction(src: String): UserDefinedAggregateFunction = {
    new UserDefinedAggregateFunction with Serializable with Logging{

      @transient val clazzUsingInDriver = ClassCreateUtils.apply(src).clazz
      @transient val instanceUsingInDriver = ClassCreateUtils.apply(src).instance

      lazy val clazzUsingInExecutor = ClassCreateUtils.apply(src).clazz
      lazy val instanceUsingInExecutor = ClassCreateUtils.apply(src).instance

      def invokeMethod[T: ClassTag](clazz: Class[_], instance: Any, method: String): T = {
        val classInfo = ClassCreateUtils.apply(src)
        classInfo.methods(method).invoke(classInfo.instance).asInstanceOf[T]
      }

      val _inputSchema = invokeMethod[StructType](clazzUsingInDriver, instanceUsingInDriver, "inputSchema")
      val _dataType = invokeMethod[DataType](clazzUsingInDriver, instanceUsingInDriver, "dataType")
      val _bufferSchema = invokeMethod[StructType](clazzUsingInDriver, instanceUsingInDriver, "bufferSchema")
      val _deterministic = invokeMethod[Boolean](clazzUsingInDriver, instanceUsingInDriver, "deterministic")

      override def inputSchema: StructType = {
        _inputSchema
      }

      override def dataType: DataType = {
        _dataType
      }

      override def bufferSchema: StructType = {
        _bufferSchema
      }

      override def deterministic: Boolean = {
        _deterministic
      }

      lazy val _update = ClassCreateUtils.apply(src).methods("update")
      lazy val _merge = ClassCreateUtils.apply(src).methods("merge")
      lazy val _initialize = ClassCreateUtils.apply(src).methods("initialize")
      lazy val _evaluate = ClassCreateUtils.apply(src).methods("evaluate")

      override def update(buffer: MutableAggregationBuffer, input: Row): Unit = {
        _update.invoke(instanceUsingInExecutor, buffer, input)
      }

      override def merge(buffer1: MutableAggregationBuffer, buffer2: Row): Unit = {
        _merge.invoke(instanceUsingInExecutor, buffer1, buffer2)
      }

      override def initialize(buffer: MutableAggregationBuffer): Unit = {
        _initialize.invoke(instanceUsingInExecutor, buffer)
      }

      override def evaluate(buffer: Row): Any = {
        _evaluate.invoke(instanceUsingInExecutor, buffer)
      }
    }
  }
}
