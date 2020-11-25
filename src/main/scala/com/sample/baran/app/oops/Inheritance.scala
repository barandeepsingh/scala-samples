package com.sample.baran.app.oops

//default is public
//private
//protected

//Overriding value directly in the constructor is also possible
//class Dog(override val creatureType:String)


//To prevent overriding
// final class or final methods, properties
// sealed class to restrict overriding within the class


object Inheritance extends App {

  class Animal(name: String = "Animal", age: Int = 0) {
    protected def eat: Unit = println("Eating") //If made private can't be accessed by child as well
  }

  class Cat extends Animal {
    def testInheritance = {
      eat
    }
  }

  val cat = new Cat
  //print(cat eat) can be accessed only if public i.e. default scope
  print(cat testInheritance)
}
