package com.sample.baran.app

object ForComprehensions extends App {
//  for (i <- 0 to 10) println(i)
  println("---")
//  for (i <- 0 until 10) println(i)
  for (i <- 'a' until 'e') println(i)



  private val value: IndexedSeq[(Int, Char)] = for {
    i <- 'a' until 'e'
    j <- 0 until 6
    if j%2==0
  } yield (j, i)

  value.foreach(x => println(x._1 + "::" + x._2))

}
