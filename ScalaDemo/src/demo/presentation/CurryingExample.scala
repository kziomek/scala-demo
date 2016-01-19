package demo.presentation

/**
 * @author Krzysztof Ziomek
 * @since  03/09/2015.
 */
object CurryingExample {

  def main(args : Array[String]): Unit = {
    // Does n divide m?
    def nDividesM(m : Int)(n : Int) = (n % m == 0)

    // Currying,
    // isEven is of type (Int) => Boolean
    val isEven = nDividesM(2)_

    println(isEven(4))
    println(isEven(5))
    println(nDividesM(2)(5))

  }

}
