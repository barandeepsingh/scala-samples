package com.sample.baran.app

class Person1(val id: Int, var name: String, private val gender: String, age: Int) {
  def getGender: String = gender
}

//var - can access getter and setter
//val - can access getter
//default - cannot access getter or setter

object OopsExample1 extends App {
  val person1 = new Person1(1, "P1", "Male", 2)
  println(person1.id)
  println(person1.name)
  println(person1.getGender)
  //Can't access as variable is default println(person1.age)
}
