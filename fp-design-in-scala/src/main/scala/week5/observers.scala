// https://www.coursera.org/learn/progfun2/lecture/ZmLWH/lecture-5-1-imperative-event-handling-the-observer-pattern

package week5

import week5.Publisher
import week5.BankAccount
import week5.Consolidator

object observers extends App{
	println("Running Observers now...")

	// run
	val a = new BankAccount
	val b = new BankAccount
	val c = new Consolidator(List(a, b))
	println(c.totalBalance) //0

	a deposit 20
	println(c.totalBalance) //20

	b deposit 30
	println(c.totalBalance) //50

}
