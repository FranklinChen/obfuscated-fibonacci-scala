package com.franklinchen

/** Obfuscated Fibonacci

  from http://statusfailed.com/blog/2015/01/27/obfuscated-fibonacci.html

  In Haskell:

  fibs = let f a = sum a : f (a >>= ([[0,1], [0]] !!)) in f [0]
  */
object Main {
  val fibs: Stream[Int] = {
    val seed = Seq(Seq(0, 1), Seq(0))

    def f(a: Stream[Int]): Stream[Int] = a.sum #:: f(a.flatMap(seed))

    f(Stream(0))
  }
}
