package net.bigdata007.arc.util.comm

import org.apache.commons.lang3.StringUtils

class ClearSymbol(string: String) {
  val symbols = Set("'", "\"", "`")

  def clearSymbol(): String = {
    var s = string.trim
    if (symbols.exists(x => s.startsWith(x))) {
      s = s.substring(1)
    }
    if (symbols.exists(x => s.endsWith(x))) {
      s = StringUtils.substring(s, 0, -1)
    }
    s
  }
}
