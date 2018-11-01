package sparkscala
import scala.io.Source
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

object scalafirst {

  def main(args: Array[String]): Unit = {
    println("Hello, world!")
    println("This is the first println good job sree")
    // set spark context
    val conf = new SparkConf().setAppName("wordcount").setMaster("local[*]")
    val sc = new SparkContext(conf)
    val input = sc.textFile("movies.csv")
    val word = "sree"
    println("You entered " + word)
//    val splitedLines = input.flatMap(line => line.split(" "))
//      .filter(x => x.equals(word))
//    println(word + " occurs " + splitedLines.count() + " times in the file")

        val totalwords = input.flatMap(line => line.split(","))
    println("Movies has  " + totalwords.count() + " words in the file")

    input.flatMap(line => line.split(",")).map(word => word + " Great movie ").foreach(println)
    println("Movies has  " + totalwords.count() + " words in the file")

  }
}
