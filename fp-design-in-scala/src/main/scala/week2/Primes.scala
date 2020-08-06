// https://www.coursera.org/learn/progfun2/lecture/Hq4hg/lecture-2-2-streams

package week2

object Primes{
 
 println("Primes")
 println("lecture-2-4-computing-with-infinite-sequences")

 def main(args: Array[String]){

    // example 1 
    // lazy op (#::)
    def from(n: Int): Stream[Int] = n #:: from(n + 1)

    val nats = from(0)
    val ms4 = nats map(_ * 4)

    println((ms4 take 100).toList)

    // example 2
    // lazy op (#::)
    def sieve(s: Stream[Int]): Stream[Int] =
        s.head #:: sieve(s.tail filter (_ % s.head != 0 ))

    // get prime numbers 
    val primes = sieve(from(2))

    println(primes.take(100).toList)

    // example 3
    def sqrtStream(x : Double): Stream[Double] = {
        def improve(guess: Double) = (guess + x / guess) / 2 
        lazy val guesses: Stream[Double] = 1 #:: (guesses map improve)
        guesses
    }

    def isGoodEnough(guess: Double, x: Double) = 
        math.abs((guess * guess - x ) / x) < 0.001

    println(sqrtStream(4).take(10).toList)


    println(sqrtStream(4).filter(isGoodEnough(_ , 4)).take(10).toList)


 }
}