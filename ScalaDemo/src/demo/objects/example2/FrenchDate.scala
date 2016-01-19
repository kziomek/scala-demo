package demo.objects.example2

/**
 * Created by kziomek on 18/07/2015.
 */
import java.text.DateFormat
import java.util.{Date, Locale}

object FrenchDate {

  def main(args: Array[String]) {
    val now = new Date
    val df = DateFormat.getDateInstance(DateFormat.LONG, Locale.FRANCE)
    println(df.format(now))
  }

}
