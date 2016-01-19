package demo.presentation.actor

/**
 * @author Krzysztof Ziomek
 * @since  03/09/2015.
 */


case object MsgPing
case object MsgPong
case object MsgStop


object Main {

  def main (args : Array[String]): Unit = {
    val pong = new Pong
    val ping = new Ping(100000, pong)
    ping.start
    pong.start

    println("Main Finished.")
  }


}
