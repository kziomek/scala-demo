package demo.classes.example1

/**
 * Created by kziomek on 19/07/2015.
 */
object ComplexNumbers {

  def main (args : Array[String]) {
    val c = new Complex(1.2, 3.4)
    println("imaginary part " + c.im)
    println(c)

  }

}
