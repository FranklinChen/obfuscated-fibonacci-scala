package com.franklinchen

import org.specs2._

class MainSpec extends Specification { def is = s2"""
  ${`First 10 Fibonacci`}
  """

  def `First 10 Fibonacci` =
    Main.fibs.take(10) === Seq(0, 1, 1, 2, 3, 5, 8, 13, 21, 34)
}
