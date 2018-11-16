package sparkscala
import scala.collection.mutable.SortedSet

object scalaMaps {

  def scalaMaps1(): Unit ={
    // cannot change this default immutable
    val map1 = Map("Amit"->1,"Sree"->2,"Meg"->3)
    //map1+=("Bob"->10,"Fred"->20) this won't work
    println("map1 : " + map1)

    val map2 = scala.collection.mutable.Map("Alice"->5,"Bob"->2,"Joe"->3)
    map2+=("Bob"->10,"Fred"->20)
    println("map2 : " + map2)

    var map3 = Map("Graig" -> 6, "Emily" -> 7)
    map3+= ("Mack" -> 43, "Allen" -> 23)
    println("map3 : " + map3)

    var map4 = map1 + ("James" ->2, "Mary" -> 6)
    println("map4 : " + map4)

    println("Print the keys only map4 : " + map4.keySet)
    println("Print the values only map4 : " + map4.values)

    // reverse tbe key value pairs
   val map5 = for((k,v) <- map4) yield (v,k)
   println("now the new key value pair is map5 : " + map5)

    val t = (1,3.14,"Jack")
    println("The Tuple t is : " + t)
    val first = t._1
    val (_,second, third) = t
    println(first,second, third)

    // Zipping of tuples the main advantage

    val symbols =Array("<","-",">")
    val counts = Array(4,20,4)
    val pairs = symbols.zip(counts)
    for(i <- 0 until pairs.length) yield  (println(pairs(i)))
    println()
    for ((s,n) <- pairs) print(s*n)
    println()
      }

}
