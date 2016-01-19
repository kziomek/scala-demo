package demo.objects.example2

/**
 * Created by kziomek on 18/07/2015.
 *
 * 1. Import selected classes from package
 * 2. Import static members from DateFormat (LONG, getDateInstance)
 * 3. Less verbose expression: df format now
 *
 */

import java.text.DateFormat._
import java.util.{Date, Locale}

object FrenchDate2 {

  def main(args: Array[String]) {
    val now = new Date
    val formatter = getDateInstance(LONG, Locale.FRANCE)
    println(formatter format now)
  }

}
