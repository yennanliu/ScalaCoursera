// https://www.coursera.org/learn/progfun2/lecture/ZmLWH/lecture-5-1-imperative-event-handling-the-observer-pattern

package week5

import week5.Publisher

class BankAccount extends Publisher{
    private var balance = 0

    def deposit(amount: Int): Unit = {
        if (amount > 0) balance = balance + amount
    }

    def withdraw(amount: Int): Int = 
        if (0 < amount && amount <= balance){
            balance = balance - amount
            balance
        } else throw new Error("insufficient funds")
}
