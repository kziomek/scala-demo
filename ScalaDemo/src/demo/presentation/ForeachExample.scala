package demo.presentation

/**
 * @author Krzysztof Ziomek
 * @since  03/09/2015.
 */
object ForeachExample {

  def main(args: Array[String]): Unit = {
    val list3 = List("mff", "cuni", "cz")

    //list3.foreach((s : String) => println(s))
    //list3.foreach(s => println(s))
//    list3.foreach(println)

    //conditional execution
//    for (s <- list3 if s.length() == 4)
//      println(s)
//
//    //to is not key word
    for (i <- 0 to 2) print("a")


  }

}
