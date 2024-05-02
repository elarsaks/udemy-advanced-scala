package lectures.part1as

import scala.annotation.tailrec

object Recap extends App {

  val aCondition: Boolean = false
  val aConditionedVal = if (aCondition) 42 else 65
  // Instructions vs expressions

  // compiler infers types for us
  val aCodeBlock = {
    if(aCondition) 54
    56
  }

  // Unit = void
  val theUnit = println("Hello Scala!")

  // functions
  def aFunction(x: Int): Int = x + 1

  // recursion: stack and tail
  @tailrec def factorial(n: Int, accumulator: Int): Int = {
    if(n <= 0) accumulator
    else factorial(n-1, n * accumulator)
  }

  // object-oriented programming
  class Animal
  class Dog extends Animal
  val aDog: Animal = new Dog // subtyping polymorphism

  trait Carnivore {
    def eat(a: Animal): Unit
  }

  class Crocodile extends Animal with Carnivore {
    override def eat(a: Animal): Unit = println("Crunch!")
  }

  // method notations
  val aCroc = new Crocodile
  aCroc.eat(aDog)
  aCroc eat aDog // natural language

}
