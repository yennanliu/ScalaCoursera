package week2

import math.abs

object SquareRootV2{

 def main(args: Array[String]){

    val tolerance = 0.0001
    def isCloseEnough(x : Double, y : Double) = 
        abs(( x - y ) / x) < tolerance

    def fixedPoint(f : Double => Double)(firstGuess : Double) = {
        def iterate(guess : Double): Double = {
            val next = f(guess)
            if (isCloseEnough(guess, next)) next
            else iterate(next)
        }
        iterate(firstGuess)
      }

    fixedPoint( x => 1 + x/2)(1)
    def sqrt(x : Double) = fixedPoint(y => (y + x / y)/ 2)(1)
    println(sqrt(2))
    println(sqrt(50))
    }
}