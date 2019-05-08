package net.bigdata007.arc.adapter

import org.apache.spark.internal.Logging

trait Adapter[T] extends Logging {

  def execute(context: T)

}
