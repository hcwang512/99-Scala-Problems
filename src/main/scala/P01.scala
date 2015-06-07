package org.p99.scala

object P01 {

  // TODO
  def last[A](list: List[A]): A = list match{
    case x:: Nil => x;
    case x::xs => last(xs)
    case Nil => throw new java.util.NoSuchElementException
  }
}
