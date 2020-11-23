package com.sample.baran.app

object ScalaCollectionBinaryOperations extends App {
  //Reduce - Apply a binary operator on all elements of Collection. Return the final value after performing operation on all elements of the collection.
  //Fold - Apply a binary operator on all elements of Collection. Start with the initial value. Return the final value after performing operation on all elements of the collection.
  //Scan - Apply a binary operator on all elements of Collection. Start with the initial value. It return a map after every operation.

  val elements = Seq(1, 2, 3, 4)

  println(elements.reduceLeft((x, y) => {
    println("x is " + x + " and y is " + y)
    x + y
  }))

  println(elements.reduceRight((x, y) => {
    println("x is " + x + " and y is " + y)
    x + y
  }))

  println(elements.foldLeft(100)((x, y) => {
    println("x is " + x + " and y is " + y)
    x + y
  }))
}
