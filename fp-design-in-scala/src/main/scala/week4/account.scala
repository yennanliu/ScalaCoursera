// https://www.coursera.org/learn/progfun2/lecture/Gd31A/lecture-4-1-functions-and-state

package week4

import week4.BankAccount

object account{
 
 def main(args: Array[String]){
 	 println("account")
 	 val acc = new BankAccount 
 	 println (acc deposit 50)
 	 println (acc withdraw 20)
 	 println (acc withdraw 20)
 }
}