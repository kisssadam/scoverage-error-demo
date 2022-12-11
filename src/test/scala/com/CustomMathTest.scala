package com

import com.CustomMath.sum
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class CustomMathTest extends AnyFunSuite {

  test("Test sum") {
    assertResult(3)(sum(1, 2))
  }

}
