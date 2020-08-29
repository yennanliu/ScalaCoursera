// https://www.coursera.org/learn/progfun2/lecture/ZmLWH/lecture-5-1-imperative-event-handling-the-observer-pattern

package week5

import week5.Publisher

class BankAccount extends Publisher{
    private var balance = 0
    // show balance, but not give client access to modify balance
    def currentBalance = balance

    def deposit(amount: Int): Unit = {
        if (amount > 0) {
        	balance = balance + amount
        	publish()
        }
    }

    def withdraw(amount: Int): Unit = 
        if (0 < amount && amount <= balance){
            balance = balance - amount
            publish()
        } else throw new Error("insufficient funds")
}
