
package week3

object rational3{

    class Rational(x: Int, y: Int){

        def numer = x 
        def denom = y

        override def toString = numer + "/" + denom

        def add(that: Rational) = 
            new Rational(
                numer * that.denom + that.numer * denom, 
                denom * that.denom
            )
    }

 def main(args: Array[String]){

        val x = new Rational(1,2)
        println(x.numer)
        println(x.denom)

        val y = new Rational(2,3)
        println(x.add(y))
 }
}