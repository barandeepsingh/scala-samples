package com.sample.baran.app.inheritance

class Class1 extends Trait1{
  val t1m1: Unit = println("Overridden")
}
object M extends App{
  val c1 = new Class1 with Trait2 {
    override val t2m2: Unit = println("Assigning trait to instance")
  }
  c1.t1m1
  c1.t2m2
}