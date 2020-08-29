// https://www.coursera.org/learn/progfun2/lecture/ZmLWH/lecture-5-1-imperative-event-handling-the-observer-pattern

package week5

trait Subscriber{
	def handler(pub: Publisher)
}

trait Publisher{

	private var subscribers: Set[Subscriber] = Set()

	def subscribe(subscriber: Subscriber): Unit = 
		subscribers += subscriber

	def unsubscribe(subscriber: Subscriber): Unit = 
		subscribers -= subscriber

	def publish(): Unit = 
		subscribers.foreach(_.handler(this))

}