package mastergingAdvanced.features

import cats.kernel.Monoid
import cats.implicits.catsKernelStdMonoidForString

object Example {
  val result: String = Monoid[String].combineAll(List("a", "b", "c"))
  System.out.println(result)
}

import cats.instances.int.catsKernelStdGroupForInt
import cats.instances.map.catsKernelStdMonoidForMap

object Exmaple2 {
  val scores: List[Map[String, Int]] = List(Map("Joe" -> 12, "Kate" -> 21), Map("Joe" -> 10))
  val totals: Map[String, Int] = Monoid[Map[String, Int]].combineAll(scores)
  System.out.println(totals)
}