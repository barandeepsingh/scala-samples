package com.sample.baran.app.oops

//Class parameters are not fields
//In order to make them accessible we need to declare val or var.
//var - can access getter and setter
//val - can access getter
//default - cannot access getter or setter
class Person(name: String, val age: Int = 10) {
  val x = 2
  println(1 + 3) // This is part of constructor call

  //  def this(name:String)=this(name,0)// Default constructors work for aux constructors as well
  def this() = this("John Doe")

  def greet(name: String): Unit = println(s"Hi $name, ${this.name} says HI!")
}

object OOBasics extends App {
  val person = new Person("Tom")
  println(person.age)
  println(person.x)
  person.greet("Timmy")
}
