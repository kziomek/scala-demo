package demo.presentation

/**
 * @author Krzysztof Ziomek
 * @since  03/09/2015.
 */
object TuplesExample {

  def main(args : Array[String]): Unit = {

    def divMod(x : Int, y : Int) = (x / y, x % y)

    val dm = divMod(10, 3)   // Tuple2[Int, Int]
    println("dm._1 : " + dm._1)     // 3
    println("dm._2 : " + dm._2)     // 1

    val (d, m) = divMod(10, 3);
    println("(d, m) : " + d + " " + m);	    // 3 1


  }

}
