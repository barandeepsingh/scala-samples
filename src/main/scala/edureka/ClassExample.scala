package edureka
//classes are public by default
class Counter1 {
  private var value = 0 //You must initialize the field
  def increment(){value=1} //Methods are public by default
  def current() = value
}
