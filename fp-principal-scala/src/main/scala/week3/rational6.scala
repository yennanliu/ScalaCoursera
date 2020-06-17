
package week3

object rational6{

    class Rational(x: Int, y: Int){
        private def gcd(a : Int, b : Int): Int = if (b == 0) a else gcd(b, a % b)
        
        // method 1)
        //private val g = gcd(x, y)
        // def numer = x / g 
        // def denom = y / g

        // method 2)
        def numer = x / gcd(x, y)
        def denom = y / gcd(x, y)

        def less(that : Rational) = numer * that.denom < that.numer * denom

        def max(that : Rational) = if (this.less(that)) that else this 

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
        println(y.add(y))
        println(x.less(y))
        println(x.max(y))
        
 }
}