package com.sample.baran.app

object PatternMatching extends App {

  //case class example
  sealed abstract class Animal

  case class Dog(name: String, age: Int) extends Animal

  case class Parrot(name: String) extends Animal

  val animal1 = new Dog("d1", 10)
  val animal2 = new Parrot("p1")

  println("Case class")
  println(matchAnimal(animal1))
  println(matchAnimal(animal2))
  println("-------------------")

  def matchAnimal(animal: Animal): String = animal match {
    case Dog(name, age) => s" I am from breed $name and my age is $age"
    case Parrot(name) => s" I am a parrot named $name and I'm ageless"
    case _ => s" Unknown animal" //Not necessary if all possible child classes are having one case each
  }


  //Constants
  println("Constants")
  println(constantsPatternMatching(0))
  println(constantsPatternMatching(4.5d))
  println(constantsPatternMatching(1))
  println(constantsPatternMatching(false))
  println("-------------------")

  def constantsPatternMatching(constant: Any): String = {
    constant match {
      case 0 => "I'm equal to zero"
      case 4.5d => "I'm a double"
      case false => "I'm the contrary of true"
      case _ => s"I'm unknown and equal to $constant"
    }
  }

  //Sequences
  println("Sequences")
  println(sequencePatternMatching(1 to 10))
  println(sequencePatternMatching(List(1, 2, 3, 4)))
  println(sequencePatternMatching(List(1)))
  println(sequencePatternMatching(Vector(1, 2, 3)))

  def sequencePatternMatching(sequence: Any): String = sequence match {
    case List(singleElement) => s"I'm a list with one element: $singleElement"
    case List(_, _*) => s"I'm a list with one or multiple elements: $sequence"
    case Vector(1, 2, _*) => s"I'm a vector: $sequence"
    case _ => s"I'm an unrecognized sequence: $sequence"
  }

  println("-------------------")

  //Tuples
  println("Tuples")

  def tuplePatternMatching(tuple: Any): String = tuple match {
    case (first, second) => s"I'm a tuple with 2 elements $first,$second"
    case (first, second, third) => s"I'm a tuple with 3 elements $first,$second,$third"
    case _ => s"I'm an unrecognized tuple $tuple"
  }

  println(tuplePatternMatching(Tuple1(1)))
  println(tuplePatternMatching(Tuple2(1, 2)))
  println(tuplePatternMatching(Tuple3(1, 2, 3)))
  println("-------------------")

  //Typed patterns
  println("Typed patterns")
  println(typedPatterns(4))
  println(typedPatterns("Apple"))
  println(typedPatterns(3.5d))

  def typedPatterns(any: Any): String = any match {
    case int: Int => s"I'm an integer with value $int"
    case string: String => s"I'm a string with value $string"
    case _ => s"I'm an unknown type with value $any"
  }

  println("------------------")
  //Regex patterns
  println("Regex patterns")
  println(matchRegex("abc"))
  println(matchRegex("a1b2c"))
  println(matchRegex("1234"))

  def matchRegex(toMatch: String): String = {
    val numeric = """([0-9]+)""".r
    val alphabetic = """([a-zA-Z]+)""".r
    val alphanumeric = """([a-zA-Z0-9]+)""".r
    toMatch match {
      case numeric(value) => s"I'm a numeric value : $value"
      case alphanumeric(value) => s"I'm an alphanumeric value : $value"
      case alphabetic(value) => s"I'm an alphabetic value : $value"
    }
  }

  //Some None
  println("Some/None example")
  println(optionStringPatternMatching(Option("Apple")))
  println(optionStringPatternMatching(None))

  def optionStringPatternMatching(option: Option[String]): String = option match {
    case Some(value) => s" Value is present : $value"
    case None => s" Value is not present"
  }

  println("---------------")

  //Pattern Guards
  println("Pattern guards")
  println(patternGuards(List(1, 2, 3), 2))
  println(patternGuards(List(1, 2, 3), 10))

  def patternGuards(toMatch: Any, expectedSize: Int): String = toMatch match {
    case list: List[Any] if (list.size >= expectedSize) => s"List is of acceptable size i.e. ${list.size}"
    case list: List[Any] => s"List does not have acceptable size. Size is ${list.size} whereas expected size is $expectedSize"
    case _ => "Not an acceptable input type"
  }

  println("---------------")

  //Extractors
  object Person {
    def apply(fullName: String) = fullName
    def unapply(fullName: String): Option[String] = {
      if (!fullName.isEmpty)
        Some(fullName.replaceAll("(?<=\\w)(\\w+)", "."))
      else
        None
    }
  }

  println("Extractors ")
  println(extractors(Person("Test Person")))
  def extractors(person: Any): String = {
    person match {
      case Person(initials) => s"My initials are $initials"
      case _ => "Could not extract initials"
    }
  }

println("--------------")
  //Closure pattern matching
  println("Closure pattern matching")
  println(closurePatternMatching(List(1, 3, 10, 15, 21, 45, 566, 7)))

  def closurePatternMatching(list: List[Any]): List[Any] = {
    list.collect {
      case i: Int if (i < 10) => i
    }
  }

  println("----------------")

  //Catch blocks

  println("Catch blocks ")
  println(catchBlocksPatternMatching(new RuntimeException("Runtime exc")))
  println(catchBlocksPatternMatching(new IllegalArgumentException("IllegalArgs exception")))
  println(catchBlocksPatternMatching(new Exception("Exc message")))

  def catchBlocksPatternMatching(exception: Exception): String = {
    try {
      throw exception
    } catch {
      case exc: IllegalArgumentException => s"IllegalArgumentException is ${exc.getMessage}"
      case exc: RuntimeException => s"RuntimeException is ${exc.getMessage}"
      case exc: Exception => s"Exception is ${exc.getMessage}"
    }
  }

  println("-------------")


}
