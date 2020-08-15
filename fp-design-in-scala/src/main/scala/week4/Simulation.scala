// https://www.coursera.org/learn/progfun2/lecture/62Xed/lecture-4-6-discrete-event-simulation-implementation-and-test

package week4

abstract class Simulation{

    type Action = () => Unit

    case class Event(time: Int, action: Action)

    private var curtime = 0
    def currentTime: Int = curtime

    private var agenda: List[Event] = List()

    private def insert(ag: List[Event], item: Event): List[Event] = ag match {
        case first :: rest if first.time <= item.time => first :: insert(rest, item)
        case _ => item :: ag 
    }

    def afterDelay(delay: Int)(block: => Unit): Unit = {
        val item = Event(currentTime + delay, () => block)
        agenda = insert(agenda, item)
    }

    def run(){
        afterDelay(0){
            println("*** Simulation started, time = " + currentTime + " ***")
        }
        loop()
    }

    private def loop(): Unit = agenda match {
        case first :: rest => 
            agenda = rest
            curtime = first.time
            first.action()
            loop()
    }

}