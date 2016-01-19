package demo.objects.example3

/**
 * Created by kziomek on 18/07/2015.
 * () => Unit - is the type of all functions which take no arguments and return nothing (the type Unit is similar to void)
 */
object Timer {
  def oncePerSecond(callback: () => Unit) {
    while (true) { callback(); Thread sleep 1000 }
  }
  def timeFlies() {
    println("time flies like an arrow...")
  }
  def main(args: Array[String]) {
    oncePerSecond(timeFlies)
  }
}