object HigherOrderFnDemo extends App {
  def doubleIt(num: Int): Int = {
    num * 2
  }

  val dFn = doubleIt(_)
  println(dFn(4))

  val numRange = 1 to 10

  numRange.map(dFn).foreach(println)

  def sendPaymentReminderToClient(name: String, days: Int) = {
    println(s"Hi, ${name} Please make your payment in ${days} days")
  }

  //val clientNames = Array("John", "Dave", "Styles", "Orton", "Ricochet", "Hunter")
  //clientNames foreach sendPaymentReminderToClient

  //val clientNamesTuples = (("John", 4), ("Dave", 2), ("Styles", 7), ("Orton", 10), ("Ricochet", 9), ("Hunter", 300))

  val clientDataMap: Map[String, Int] = Map("John" -> 4, "Dave" -> 3, "Hunter" -> 300, "Ricochet" -> 6)

  clientDataMap.keys.foreach {
    key => sendPaymentReminderToClient(key, clientDataMap(key))
  }


}
