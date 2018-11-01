package demo

import org.scalatest.FunSuite

class HelloTest extends FunSuite {

  test("testSayHello Works Correctly") {
    val hello = new HelloWorld
    assert(hello.sayHello("Scala") == "Hello Scala!")

  }

}
