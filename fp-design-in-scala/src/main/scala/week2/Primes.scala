// https://www.coursera.org/learn/progfun2/lecture/Hq4hg/lecture-2-2-streams

package week2

object Primes{
 
 println("Primes")
 println("lecture-2-4-computing-with-infinite-sequences")

 def main(args: Array[String]){

    def from(n: Int): Stream[Int] = n #:: from(n + 1)

    val nats = from(0)
    val ms4 = nats map(_ * 4)

    println((ms4 take 100).toList)


 }
}