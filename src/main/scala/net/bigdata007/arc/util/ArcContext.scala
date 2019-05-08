package net.bigdata007.arc.util

import scala.collection.mutable

object ArcContext {


  private val options = mutable.HashMap[String, Any](
    "arc_showTables" -> mutable.Set[String](),
    "arc_set" -> mutable.Map[String, String]()
  )

  def put[T](key: String, value: T): mutable.HashMap[String, Any] = {
    options += key -> value
  }

  def get[T](key: String): T = {
    options(key).asInstanceOf[T]
  }

  def all(): mutable.HashMap[String, Any] = options

}
