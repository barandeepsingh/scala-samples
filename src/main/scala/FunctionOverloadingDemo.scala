object FunctionOverloadingDemo extends App {

  def returnGreetingMessage(name: String = "Simran", greeting: String = "Very Good ", timeOfDay: String = "Morning!! ") = {
    greeting + timeOfDay + name
  }

  println(returnGreetingMessage("Baran", "Good ", "Evening!! "))
  println(returnGreetingMessage( greeting="Good ", timeOfDay = "Evening!! "))
  println(returnGreetingMessage())
}
