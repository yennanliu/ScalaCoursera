package week2

import math.abs

object FindFixedPoints{

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

    println(fixedPoint(x => 1 + x/2)(1))
    println(fixedPoint(x => 1 + x/2)(10))
    }
}