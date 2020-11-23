package edureka

//RestrictSetterCompletely
class Circle {
  val pi = 3.14

}

//No restrictions
class Square {
  var side = 1

}

//Custom Setter
class Oval {
  private var size = 4

  def updateSize = size + 1;

  def showSize = size
}

object RestrictingSetters extends App {

  val circle = new Circle
  println(circle.pi)

  val square = new Square
  square.side = 3
  println(square.side)

  val oval = new Oval
  oval.updateSize
  println(oval.showSize)


}
class TestPrimConst(name:String,age:Int){

}
