package edureka

trait Logger {
  def info(message: String)

  def error(message: String) = {
    println("ERROR : " + message)
  }
}

class TraitDemo extends Logger {
  override def info(message: String): Unit = println("INFO: " + message)

}


object MainObj extends App {
  val td = new TraitDemo
  td.error("This is an error message")

  td.info(" Info message ")


}

