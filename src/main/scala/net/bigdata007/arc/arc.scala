package net.bigdata007.arc

import net.bigdata007.arc.util.comm.{ClearSymbol, SetImplicit}

package object arc {

  implicit def strClearSymbol(string: String): ClearSymbol = {
    new ClearSymbol(string)
  }
  implicit def replaceSet(text:String):SetImplicit={
    new SetImplicit(text)
  }

}
