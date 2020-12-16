package com.sample.baran.app

import scala.util.Try

object TryMonad extends App{

  def advancedTryFunction(str:String):Try[String]= Try {
    str.concat("testStr")
  }

def fallbackFunction:String = "fallback str"

  println(advancedTryFunction(null).isSuccess)
  println(advancedTryFunction(null).isFailure)
  println(advancedTryFunction(null).getOrElse(fallbackFunction))
  println(advancedTryFunction("t1"))

}
