// https://www.coursera.org/learn/progfun2/lecture/j6yMA/lecture-2-3-lazy-evaluation

package week2

object LazyEvaluation{
 
 println("LazyEvaluation")

 def main(args: Array[String]){

    def expr = {
        val x = { print("x"); 1}
        lazy val y = { print("y"); 2 }
        def z = { print("z"); 3 }
        z + y + x + z + y + z
    }

    println(expr) // side effect = xzyzz

    //( streamRange(1000, 10000) filter isPrime) apply 1 
 
 }
}