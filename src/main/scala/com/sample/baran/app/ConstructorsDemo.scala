package com.sample.baran.app
//Auxiliary constructor -> One aux constructor can call another aux constructor or primary constructor.
//Directly or indirectly they call primary constructor.
class Person2(var id: Int, var name: String) {
  def this() {
    this("Tom")
//    this(1, "Tom")
  }

  def this(name: String) {
//    this()
    this(1, name)
  }
}

object ConstructorsDemo extends App {

}
