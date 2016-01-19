package demo.traits

/**
 * Created by kziomek on 19/07/2015.
 * Trait is like java 8 interface with implemented methods
 */
object TraitExample {

  def main (args : Array[String]) {
    val july = new Date(2015, 7, 30)
    val june = new Date(2015, 6, 1)

    println("Is "+ july + " < " + june + " : "  + (july < june) )
    println("Is "+ july + " > " + june + " : "  + (july > june) )

  }

}
