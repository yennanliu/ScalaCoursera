// 3rd version of version : remove redundant variable via bracket ({}) property

package week1

object FindSquareV3{

 def main(args: Array[String]){

        def abs(x:Double) = if (x < 0) -x else x

        def sqrt(x: Double) = { 

            def sqrtIter(guess: Double): Double =
              if (isGoodEnough(guess)) guess
              else sqrtIter(improve(guess))

            def isGoodEnough(guess: Double) = abs(guess * guess  -x ) / x  < 0.001 

            def improve(guess: Double) = (guess + x / guess) / 2

            sqrtIter(1.0)
        }

        println(sqrt(2))
        println(sqrt(4))
        println(sqrt(1e-6))
        println(sqrt(1e60))
    }
}