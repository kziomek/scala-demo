package demo.objects.example3

/**
 * Created by kziomek on 18/07/2015.
 * timeFlies() from Timer example refactored to anonymous function
 * arguments => body
 */
object TimerAnonymous {
  def oncePerSecond(callback: () => Unit) {
    while (true) { callback(); Thread sleep 1000 }
  }
  def main(args: Array[String]) {
    oncePerSecond( () => println("time flies like an arrow...") )
  }
}
