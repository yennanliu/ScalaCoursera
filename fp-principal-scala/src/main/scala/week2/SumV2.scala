// 2nd version of Sum : reweite sum with pass function f and reduct the number of variablr (a,b)

package week2

object SumV2{

 def main(args: Array[String]){

    // f: Int => Int : anonymous function in scala
    def sum(f: Int => Int): (Int, Int) => Int = {
        def sumF(a: Int, b: Int): Int = 
            if (a > b) 0 
            else f(a) + sumF(a + 1 , b)
        sumF
    }

    // x => x*x  : anonymous function in scala
    def factorial(n : Int): Int = {
        if (n == 0) 1 else n*factorial(n-1)
        }

    def sumInts = sum(x => x)
    def sumCubes = sum(x => x * x * x)
    def sumFactorials  = sum(factorial)

    println(sumCubes(1, 10) +  sumFactorials(10 ,20))
 }
}