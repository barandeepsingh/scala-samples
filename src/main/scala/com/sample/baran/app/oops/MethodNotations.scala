package com.sample.baran.app.oops

object MethodNotations extends App {

  class Person(val name: String, val age: Int) {
    def +(value: String): Person = new Person(this.name + value, this.age)

    def unary_+ : Person = new Person(this.name, this.age + 1)

    def learns(tech: String): String = s"${this.name} learns $tech"

    def learnsScala: String = this learns "Scala"

    def apply(name: String, age: Int): Person = new Person(name, age)

    def apply(movieWatchCount: Int): String = s"${this.name} has watched Bhool Bhulaiya $movieWatchCount times"
  }


  val chundan = new Person("Chundan", 22)

  println(chundan + " Halwai" name)

  println(+chundan age)

  println(chundan learns "Akka")
  println(chundan learnsScala)

  println(chundan(10))
}
