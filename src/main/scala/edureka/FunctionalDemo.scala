package edureka

object FunctionalDemo extends App {

  def genericOperations(f: (Int,Int,Int)=>Int,num1: Int,num2:Int,num3:Int):Int={
    f(num1,num2,num3)
  }

  println("Sum of numbers "+genericOperations(_+_+_,2,3,4))
  println("Sum of numbers "+genericOperations(_*_*_,2,3,4))


  println((1 to 4).reduceLeft(_*_))
  println((1 to 4).reduce(_*_))
}
