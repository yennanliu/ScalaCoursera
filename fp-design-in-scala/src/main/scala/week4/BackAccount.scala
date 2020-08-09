// https://www.coursera.org/learn/progfun2/lecture/Gd31A/lecture-4-1-functions-and-state

package week4

object BackAccount{
 
 class BackAccount{
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

 def main(args: Array[String]){

     println("BackAccount")

}

 }