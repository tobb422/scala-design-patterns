package mastergingAdvanced.features

case class Cell[A](value: A) {
  def map[B](function: A => B): Cell[B] = {
    Cell(function(value))
  }
}

import cats.Functor
import cats.implicits.catsStdInstancesForOption

object Example {
  implicit val cellFunctor: Functor[Cell] = new Functor[Cell] {
    def map[A, B](fa: Cell[A])(f: A => B): Cell[B] = fa.map(f)
  }

  val maybeName = Option("Joe")
  println(Functor[Option].map(maybeName)(_.length))
}
