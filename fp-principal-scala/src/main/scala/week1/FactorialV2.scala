// 2ne version of Factorial : tail recursive verison  

package week1

object FactorialV2{

 def main(args: Array[String]){

    def factorial(n : Int): Int = {

    	def loop(acc : Int, n : Int): Int = { 
    		if (n == 0) acc
    		else loop(acc * n, n - 1)
    		} 
        loop(1, n)
        }

    println(factorial(4))
    println(factorial(10))
    println(factorial(30))
    }
}