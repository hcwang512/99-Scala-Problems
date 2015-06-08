package org.p99.scala

object P02 {

  def penultimate[A](input: List[A]): A = {
    input match {
      case x :: _ :: Nil => x
      case x :: tail => penultimate(tail)
      case _ => throw new java.util.NoSuchElementException
    }
  }
}
