package sparkscala

object scalaClasses {

  def classesExample() {

    class Person {
      var age = 0
    }

    val myPerson = new Person
    println(myPerson.age)
    myPerson.age = 21
    println(myPerson.age)

  }
}
