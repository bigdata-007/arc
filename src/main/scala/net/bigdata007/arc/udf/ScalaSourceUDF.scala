package net.bigdata007.arc.udf

import net.bigdata007.arc.util.ClassCreateUtils
import org.apache.spark.internal.Logging
import org.apache.spark.sql.catalyst.JavaTypeInference
import org.apache.spark.sql.types.DataType

object ScalaSourceUDF {

  def apply(func: String): (AnyRef, Array[DataType], DataType) = {
    val (argumentTypes, returnType) = getFunctionReturnType(func)
    (generateFunction(func, argumentTypes.length), argumentTypes, returnType)
  }

  private def getFunctionReturnType(func: String): (Array[DataType], DataType) = {
    val classInfo = ClassCreateUtils.apply(func)
    val method = classInfo.defaultMethod
    val dataType = JavaTypeInference.inferDataType(method.getReturnType)._1
    (method.getParameterTypes.map(JavaTypeInference.inferDataType).map(_._1), dataType)
  }

  def generateFunction(func: String, argumentsNum: Int): AnyRef = {
    lazy val instance = ClassCreateUtils(func).instance
    lazy val method = ClassCreateUtils(func).defaultMethod
    lazy val setupMethod = ClassCreateUtils(func).methods.get("setup")
    lazy val hasSetupMethod = ClassCreateUtils(func).methods.contains("setup")

    argumentsNum match {
      case 0 => new (() => Any) with Serializable with Logging {
        var setupInit = false

        override def apply(): Any = {
          try {
            if (!setupInit && hasSetupMethod) {
              setupMethod.get.invoke(instance)
              setupInit = true
            }
            method.invoke(instance)
          } catch {
            case e: Exception =>
              logError(e.getMessage)
          }
        }
      }
      case 1 => new (Object => Any) with Serializable with Logging {
        var setupInit = false

        override def apply(v1: Object): Any = {
          try {
            if (!setupInit && hasSetupMethod) {
              setupMethod.get.invoke(instance)
              setupInit = true
            }
            method.invoke(instance, v1)
          } catch {
            case e: Exception =>
              e.printStackTrace()
              logError(e.getMessage)
              null
          }
        }
      }
      case 2 => new ((Object, Object) => Any) with Serializable with Logging {
        var setupInit = false

        override def apply(v1: Object, v2: Object): Any = {
          try {
            if (!setupInit && hasSetupMethod) {
              setupMethod.get.invoke(instance)
              setupInit = true
            }
            method.invoke(instance, v1, v2)
          } catch {
            case e: Exception =>
              logError(e.getMessage)
              null
          }
        }
      }
      case 3 => new ((Object, Object, Object) => Any) with Serializable with Logging {
        var setupInit = false

        override def apply(v1: Object, v2: Object, v3: Object): Any = {
          try {
            if (!setupInit && hasSetupMethod) {
              setupMethod.get.invoke(instance)
              setupInit = true
            }
            method.invoke(instance, v1, v2, v3)
          } catch {
            case e: Exception =>
              logError(e.getMessage)
              null
          }
        }
      }
      case 4 => new ((Object, Object, Object, Object) => Any) with Serializable with Logging {
        var setupInit = false

        override def apply(v1: Object, v2: Object, v3: Object, v4: Object): Any = {
          try {
            if (!setupInit && hasSetupMethod) {
              setupMethod.get.invoke(instance)
              setupInit = true
            }
            method.invoke(instance, v1, v2, v3, v4)
          } catch {
            case e: Exception =>
              logError(e.getMessage)
              null
          }
        }
      }
      case 5 => new ((Object, Object, Object, Object, Object) => Any) with Serializable with Logging {
        var setupInit = false

        override def apply(v1: Object, v2: Object, v3: Object, v4: Object, v5: Object): Any = {
          try {
            if (!setupInit && hasSetupMethod) {
              setupMethod.get.invoke(instance)
              setupInit = true
            }
            method.invoke(instance, v1, v2, v3, v4, v5)
          } catch {
            case e: Exception =>
              logError(e.getMessage)
              null
          }
        }
      }
      case 6 => new ((Object, Object, Object, Object, Object, Object) => Any) with Serializable with Logging {
        var setupInit = false

        override def apply(v1: Object, v2: Object, v3: Object, v4: Object, v5: Object, v6: Object): Any = {
          try {
            if (!setupInit && hasSetupMethod) {
              setupMethod.get.invoke(instance)
              setupInit = true
            }
            method.invoke(instance, v1, v2, v3, v4, v5, v6)
          } catch {
            case e: Exception =>
              logError(e.getMessage)
              null
          }
        }
      }
      case 7 => new ((Object, Object, Object, Object, Object, Object, Object) => Any) with Serializable with Logging {
        var setupInit = false

        override def apply(v1: Object, v2: Object, v3: Object, v4: Object, v5: Object, v6: Object, v7: Object): Any = {
          try {
            if (!setupInit && hasSetupMethod) {
              setupMethod.get.invoke(instance)
              setupInit = true
            }
            method.invoke(instance, v1, v2, v3, v4, v5, v6, v7)
          } catch {
            case e: Exception =>
              logError(e.getMessage)
              null
          }
        }
      }
      case 8 => new ((Object, Object, Object, Object, Object, Object, Object, Object) => Any) with Serializable with Logging {
        var setupInit = false

        override def apply(v1: Object, v2: Object, v3: Object, v4: Object, v5: Object, v6: Object, v7: Object, v8: Object): Any = {
          try {
            if (!setupInit && hasSetupMethod) {
              setupMethod.get.invoke(instance)
              setupInit = true
            }
            method.invoke(instance, v1, v2, v3, v4, v5, v6, v7, v8)
          } catch {
            case e: Exception =>
              logError(e.getMessage)
              null
          }
        }
      }
      case 9 => new ((Object, Object, Object, Object, Object, Object, Object, Object, Object) => Any) with Serializable with Logging {
        var setupInit = false

        override def apply(v1: Object, v2: Object, v3: Object, v4: Object, v5: Object, v6: Object, v7: Object, v8: Object, v9: Object): Any = {
          try {
            if (!setupInit && hasSetupMethod) {
              setupMethod.get.invoke(instance)
              setupInit = true
            }
            method.invoke(instance, v1, v2, v3, v4, v5, v6, v7, v8, v9)
          } catch {
            case e: Exception =>
              logError(e.getMessage)
              null
          }
        }
      }
      case 10 => new Function10[Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Any] with Serializable with Logging {
        var setupInit = false

        override def apply(v1: Object, v2: Object, v3: Object, v4: Object, v5: Object, v6: Object, v7: Object, v8: Object, v9: Object, v10: Object): Any = {
          try {
            if (!setupInit && hasSetupMethod) {
              setupMethod.get.invoke(instance)
              setupInit = true
            }
            method.invoke(instance, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10)
          } catch {
            case e: Exception =>
              logError(e.getMessage)
              null
          }
        }
      }
      case 11 => new Function11[Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Any] with Serializable with Logging {
        var setupInit = false

        override def apply(v1: Object, v2: Object, v3: Object, v4: Object, v5: Object, v6: Object, v7: Object, v8: Object, v9: Object, v10: Object, v11: Object): Any = {
          try {
            if (!setupInit && hasSetupMethod) {
              setupMethod.get.invoke(instance)
              setupInit = true
            }
            method.invoke(instance, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11)
          } catch {
            case e: Exception =>
              logError(e.getMessage)
              null
          }
        }
      }
      case 12 => new Function12[Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Any] with Serializable with Logging {
        var setupInit = false

        override def apply(v1: Object, v2: Object, v3: Object, v4: Object, v5: Object, v6: Object, v7: Object, v8: Object, v9: Object, v10: Object, v11: Object, v12: Object): Any = {
          try {
            if (!setupInit && hasSetupMethod) {
              setupMethod.get.invoke(instance)
              setupInit = true
            }
            method.invoke(instance, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12)
          } catch {
            case e: Exception =>
              logError(e.getMessage)
              null
          }
        }
      }
      case 13 => new Function13[Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Any] with Serializable with Logging {
        var setupInit = false

        override def apply(v1: Object, v2: Object, v3: Object, v4: Object, v5: Object, v6: Object, v7: Object, v8: Object, v9: Object, v10: Object, v11: Object, v12: Object, v13: Object): Any = {
          try {
            if (!setupInit && hasSetupMethod) {
              setupMethod.get.invoke(instance)
              setupInit = true
            }
            method.invoke(instance, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13)
          } catch {
            case e: Exception =>
              logError(e.getMessage)
              null
          }
        }
      }
      case 14 => new Function14[Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Any] with Serializable with Logging {
        var setupInit = false

        override def apply(v1: Object, v2: Object, v3: Object, v4: Object, v5: Object, v6: Object, v7: Object, v8: Object, v9: Object, v10: Object, v11: Object, v12: Object, v13: Object, v14: Object): Any = {
          try {
            if (!setupInit && hasSetupMethod) {
              setupMethod.get.invoke(instance)
              setupInit = true
            }
            method.invoke(instance, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14)
          } catch {
            case e: Exception =>
              logError(e.getMessage)
              null
          }
        }
      }
      case 15 => new Function15[Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Any] with Serializable with Logging {
        var setupInit = false

        override def apply(v1: Object, v2: Object, v3: Object, v4: Object, v5: Object, v6: Object, v7: Object, v8: Object, v9: Object, v10: Object, v11: Object, v12: Object, v13: Object, v14: Object, v15: Object): Any = {
          try {
            if (!setupInit && hasSetupMethod) {
              setupMethod.get.invoke(instance)
              setupInit = true
            }
            method.invoke(instance, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15)
          } catch {
            case e: Exception =>
              logError(e.getMessage)
              null
          }
        }
      }
      case 16 => new Function16[Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Any] with Serializable with Logging {
        var setupInit = false

        override def apply(v1: Object, v2: Object, v3: Object, v4: Object, v5: Object, v6: Object, v7: Object, v8: Object, v9: Object, v10: Object, v11: Object, v12: Object, v13: Object, v14: Object, v15: Object, v16: Object): Any = {
          try {
            if (!setupInit && hasSetupMethod) {
              setupMethod.get.invoke(instance)
              setupInit = true
            }
            method.invoke(instance, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16)
          } catch {
            case e: Exception =>
              logError(e.getMessage)
              null
          }
        }
      }
      case 17 => new Function17[Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Any] with Serializable with Logging {
        var setupInit = false

        override def apply(v1: Object, v2: Object, v3: Object, v4: Object, v5: Object, v6: Object, v7: Object, v8: Object, v9: Object, v10: Object, v11: Object, v12: Object, v13: Object, v14: Object, v15: Object, v16: Object, v17: Object): Any = {
          try {
            if (!setupInit && hasSetupMethod) {
              setupMethod.get.invoke(instance)
              setupInit = true
            }
            method.invoke(instance, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17)
          } catch {
            case e: Exception =>
              logError(e.getMessage)
              null
          }
        }
      }
      case 18 => new Function18[Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Any] with Serializable with Logging {
        var setupInit = false

        override def apply(v1: Object, v2: Object, v3: Object, v4: Object, v5: Object, v6: Object, v7: Object, v8: Object, v9: Object, v10: Object, v11: Object, v12: Object, v13: Object, v14: Object, v15: Object, v16: Object, v17: Object, v18: Object): Any = {
          try {
            if (!setupInit && hasSetupMethod) {
              setupMethod.get.invoke(instance)
              setupInit = true
            }
            method.invoke(instance, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18)
          } catch {
            case e: Exception =>
              logError(e.getMessage)
              null
          }
        }
      }
      case 19 => new Function19[Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Any] with Serializable with Logging {
        var setupInit = false

        override def apply(v1: Object, v2: Object, v3: Object, v4: Object, v5: Object, v6: Object, v7: Object, v8: Object, v9: Object, v10: Object, v11: Object, v12: Object, v13: Object, v14: Object, v15: Object, v16: Object, v17: Object, v18: Object, v19: Object): Any = {
          try {
            if (!setupInit && hasSetupMethod) {
              setupMethod.get.invoke(instance)
              setupInit = true
            }
            method.invoke(instance, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19)
          } catch {
            case e: Exception =>
              logError(e.getMessage)
              null
          }
        }
      }
      case 20 => new Function20[Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Any] with Serializable with Logging {
        var setupInit = false

        override def apply(v1: Object, v2: Object, v3: Object, v4: Object, v5: Object, v6: Object, v7: Object, v8: Object, v9: Object, v10: Object, v11: Object, v12: Object, v13: Object, v14: Object, v15: Object, v16: Object, v17: Object, v18: Object, v19: Object, v20: Object): Any = {
          try {
            if (!setupInit && hasSetupMethod) {
              setupMethod.get.invoke(instance)
              setupInit = true
            }
            method.invoke(instance, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20)
          } catch {
            case e: Exception =>
              logError(e.getMessage)
              null
          }
        }
      }
      case 21 => new Function21[Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Any] with Serializable with Logging {
        var setupInit = false

        override def apply(v1: Object, v2: Object, v3: Object, v4: Object, v5: Object, v6: Object, v7: Object, v8: Object, v9: Object, v10: Object, v11: Object, v12: Object, v13: Object, v14: Object, v15: Object, v16: Object, v17: Object, v18: Object, v19: Object, v20: Object, v21: Object): Any = {
          try {
            if (!setupInit && hasSetupMethod) {
              setupMethod.get.invoke(instance)
              setupInit = true
            }
            method.invoke(instance, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20, v21)
          } catch {
            case e: Exception =>
              logError(e.getMessage)
              null
          }
        }
      }
      case 22 => new Function22[Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Any] with Serializable with Logging {
        var setupInit = false

        override def apply(v1: Object, v2: Object, v3: Object, v4: Object, v5: Object, v6: Object, v7: Object, v8: Object, v9: Object, v10: Object, v11: Object, v12: Object, v13: Object, v14: Object, v15: Object, v16: Object, v17: Object, v18: Object, v19: Object, v20: Object, v21: Object, v22: Object): Any = {
          try {
            if (!setupInit && hasSetupMethod) {
              setupMethod.get.invoke(instance)
              setupInit = true
            }
            method.invoke(instance, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20, v21, v22)
          } catch {
            case e: Exception =>
              logError(e.getMessage)
              null
          }
        }
      }
      case n => throw new Exception(s"UDF with $n arguments is not supported ")
    }
  }
}
