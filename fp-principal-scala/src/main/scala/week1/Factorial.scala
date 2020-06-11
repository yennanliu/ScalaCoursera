// 1st version of Factorial

package week1

object Factorial{

 def main(args: Array[String]){

    def factorial(n : Int): Int = {
        if (n == 0) 1 else n*factorial(n-1)
        }

    println(factorial(4))
    println(factorial(10))
    println(factorial(30))
    }
}