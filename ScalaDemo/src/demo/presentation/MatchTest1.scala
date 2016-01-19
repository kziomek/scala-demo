package demo.presentation

/**
 * @author Krzysztof Ziomek
 * @since  04/09/2015.
 */
object MatchTest1 extends App {

  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }
  println(matchTest(2))

}
