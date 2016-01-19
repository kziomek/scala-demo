package demo.presentation

/**
 * @author Krzysztof Ziomek
 * @since  03/09/2015.
 */
object ListsExample {

  def main(args: Array[String]) {

    val lst = List("b", "c", "d")
    println("lst: " + lst )
    println("lst head : " + lst.head)  // “b”
    println("lst tail : " + lst.tail ) // List(“c”, “d”)
    val lst2 = "a" :: lst    // cons operator
    println("lst2: " + lst2 )


    //Nil  =  synonym for empty list
    val l = 1 :: 2 :: 3 :: Nil
    println("lNil: " + l )

    //List concatenation
    val l2 = List(1, 2, 3) ::: List(4, 5)
    println("l2: " + l2 )
  }

}
