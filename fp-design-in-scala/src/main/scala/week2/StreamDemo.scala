// https://www.coursera.org/learn/progfun2/lecture/Hq4hg/lecture-2-2-streams

package week2

object StreamDemo{
 
 println("Stream")

 def main(args: Array[String]){

    // define simple stream
    //val x = Stream(1,2,3)
    val y = LazyList(1,2,3)

    //println(x)
    println(y)

    // trait Stream[+A] extends Seq[A]{
    //     def isEmpty: Boolean
    //     def head: A
    //     def tail: Stream[A]
    // }

    // def cons[T](hd: T, tl: => Stream[T]) = new Stream[T] {
    //     def isEmpty  = false
    //     def head = hd
    //     def tail = tl
    // }

    // val empty = new Stream[Nothing]{
    //     def isEmpty = true
    //     def head = throw new NoSuchElementException("empty.head")
    //     def tail = throw new NoSuchElementException("empty.tail")
    // }

 }
}