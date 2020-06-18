
package week3

object rational8{

    class Rational(x: Int, y: Int){
        require(y != 0, "denominator must be nonzero")
        
        def this(x : Int) = this(x, 1)

        private def gcd(a : Int, b : Int): Int = if (b == 0) a else gcd(b, a % b)
        
        // method 1)
        //private val g = gcd(x, y)
        // def numer = x / g 
        // def denom = y / g

        // method 2)
        def numer = x / gcd(x, y)
        def denom = y / gcd(x, y)

        def < (that : Rational) = numer * that.denom < that.numer * denom

        def max(that : Rational) = if (this < that) that else this 

        def + (that: Rational) = 
            new Rational(
                numer * that.denom + that.numer * denom, 
                denom * that.denom
            )

        def unary_- : Rational = new Rational(-numer, denom)
 
        def - (that: Rational) = this + -that

        override def toString = numer + "/" + denom
    }

 def main(args: Array[String]){

        val x = new Rational(1,2)
        val y = new Rational(5,7)
        val z = new Rational(3,2)

        println(x.numer)
        println(x.denom)
        println(x + y)
        println(x - y - z)
        println(y + y)
        println(x < y)
        println(x max y)

        println(new Rational(2))

        //val strange = new Rational(1, 0)
        
 }
}