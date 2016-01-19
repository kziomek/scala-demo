package demo.presentation

/**
 * @author Krzysztof Ziomek
 * @since  04/09/2015.
 */
object PatternMatchingExample {

  def main (args : Array[String]) {

    def flatten(list: List[Any]) : List[Any] =
      list match {
        case (x: List[Any]) :: xs => println("Ax " + x + " Axs " +xs ); flatten(x) ::: flatten(xs)
        case x :: xs              => println("Bx " + x + " Bxs " +xs); x :: flatten(xs)
        case Nil                  => println("C "); Nil
      }

    val nested = List(1, List(2, 3), 4)
    println("nested: " + nested);
    val flat = flatten(nested); // List(1, 2, 3, 4)
    println("flat: " + flat)

  }

}
