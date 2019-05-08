package net.bigdata007.arc.util

import scala.collection.mutable

object ArcUdfContext {

  private val options = mutable.HashMap[String, Any]()

  def put[T](key: String, value: T): mutable.HashMap[String, Any] = {
    options += key -> value
  }

  def get[T](key: String): T = {
    options(key).asInstanceOf[T]
  }

  def all(): mutable.HashMap[String, Any] = options

}
