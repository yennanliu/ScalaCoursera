
package week3

object rational4{

    class Rational(x: Int, y: Int){

        def numer = x 
        def denom = y

        def add(that: Rational) = 
            new Rational(
                numer * that.denom + that.numer * denom, 
                denom * that.denom
            )

        def neg: Rational = new Rational(-numer, denom)
 
        def sub(that: Rational) = add(that.neg)

        override def toString = numer + "/" + denom
    }

 def main(args: Array[String]){

        val x = new Rational(1,2)
        val y = new Rational(5,7)
        val z = new Rational(3,2)

        println(x.numer)
        println(x.denom)
        println(x.add(y))
        println(x.sub(y).sub(z))

 }
}