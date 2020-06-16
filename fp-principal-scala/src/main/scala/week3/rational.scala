
package week3

object rational{

    class Rational(x: Int, y: Int){

        def numer = x 
        def denom = y
    }

 def main(args: Array[String]){

    val x = new Rational(1,2)
    println(x)
    println(x.numer)
    println(x.denom)

 }
}