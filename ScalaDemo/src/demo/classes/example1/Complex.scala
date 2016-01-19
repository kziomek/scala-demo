package demo.classes.example1

/**
 * Created by kziomek on 19/07/2015.
 * 1. Scala class can have parameters
 * 2. Methods without arguments
 * 3. Mandatory overrride modifier to avoid accidental overriding
 */
class Complex(real : Double, imaginary : Double) {

  def re() = real
  def im() = imaginary

  override def toString() =
    "" + re + (if (im < 0) "" else "+") + im + "i"

}
