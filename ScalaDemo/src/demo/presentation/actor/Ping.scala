package demo.presentation.actor

import scala.actors.Actor

/**
 * @author Krzysztof Ziomek
 * @since  03/09/2015.
 */
class Ping(count: Int, pong: Actor) extends Actor {
  def act() {
    var pingsSent = 0
    println("Ping: sending ping " + pingsSent)
    pong ! MsgPing; pingsSent += 1
    while(true) {
      receive {
        case MsgPong =>
          if (pingsSent < count) {
            if (pingsSent % 1000 == 0)
              println("Ping: sending ping " + pingsSent)
            pong ! MsgPing; pingsSent += 1
          } else {
            println("Ping: sending stop")
            pong ! MsgStop
            exit()
          }
      }}}}
