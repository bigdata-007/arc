package net.bigdata007.arc.util.comm

import net.bigdata007.arc.util.ArcContext

import scala.collection.mutable

class SetImplicit(text: String) {

  def replaceSet(): String = {
    val sets = ArcContext
      .get[mutable.Map[String, String]]("arc_set")
    var _text: String = text
    sets.foreach(kv => {
      _text = _text.replaceAll("\\$\\{" + kv._1 + "\\}", kv._2)
    })
    _text
  }
}
