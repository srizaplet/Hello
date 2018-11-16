package sparkscala

import scala.collection.mutable.ArrayBuffer
object arrayscala {

  def arraymethods():Unit = {
    val arr1 = Array(1,2,3,4,543,3,22,322,334,33,433)
      for (i <- 0 until arr1.length) println(s"${arr1(i)}")

    val arr2 = ArrayBuffer("Hello","India","US","Japan")
    arr2 += ("Australia","Australia")
    arr2.insert(2,"Nepal")
    for (i <-0 until arr2.length) print(s"${arr2(i)} , ")
  }
}
