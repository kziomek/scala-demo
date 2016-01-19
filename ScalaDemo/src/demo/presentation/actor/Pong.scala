package demo.presentation.actor

import scala.actors.Actor

/**
 * @author Krzysztof Ziomek
 * @since  03/09/2015.
 */
class Pong extends Actor {
  def act() {
    var pongCount = 0
    while(true) {
      receive {
        case MsgPing =>
          if (pongCount % 1000 == 0)
            println("Pong: replying " + pongCount)
          sender ! MsgPong
          pongCount += 1
        case MsgStop =>
          println("Pong: stop")
          exit()
      }
    }
  }
}

