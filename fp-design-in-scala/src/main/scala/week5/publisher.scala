// https://www.coursera.org/learn/progfun2/lecture/ZmLWH/lecture-5-1-imperative-event-handling-the-observer-pattern

package week5

trait Subcriber{
	def handler(pub: Publisher)
}

trait Publisher{

	private var subcribers: Set[Subcriber] = Set()

	def subcribe(subcriber: Subcriber): Unit = 
		subcribers += subcriber

	def unsubcribe(subcriber: Subcriber): Unit = 
		subcribers -= subcriber

	def publish(): Unit = 
		subcribers.foreach(_.handler(this))

}