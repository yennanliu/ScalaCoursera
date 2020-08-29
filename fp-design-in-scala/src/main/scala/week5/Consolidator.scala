// https://www.coursera.org/learn/progfun2/lecture/ZmLWH/lecture-5-1-imperative-event-handling-the-observer-pattern

package week5

import week5.Publisher
import week5.BankAccount

class Consolidator(observed: List[BankAccount]) extends Subscriber{
    observed.foreach(_.subscribe(this))

    private var total: Int = _
    compute()

    private def compute() = 
        total = observed.map(_.currentBalance).sum

    def handler(pub: Publisher) = compute()

    def totalBalance = total
}