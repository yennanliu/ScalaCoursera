// https://www.coursera.org/learn/progfun1/lecture/JIPKx/lecture-6-2-combinatorial-search-and-for-expressions

package week6

object Pairs{
    def isPrime(n: Int) = (2 until n) forall (n % _ != 0)

 def main(args: Array[String]){
    val n = 7 
    // double for loop
    (1 until n).map(i => 
       (1 until i).map( j => (i, j)) )

    // flatmap the result
    (1 until n) flatMap (i => 
       (1 until i).map( j => (i, j)) )

    // flatmap the result and filter with isPrime udf
    (1 until n) flatMap (i => 
       (1 until i).map( j => (i, j)) ) filter (pair => 
        isPrime(pair._1 + pair._2))

 }
}