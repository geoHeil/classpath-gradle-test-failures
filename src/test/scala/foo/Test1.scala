package foo

import org.scalatest.{FlatSpec, Matchers}

class Test1 extends FlatSpec with Matchers {

  "foo" should "test fine" in {

    println("hello")
    assert(true, true)
  }


}
