
package week3

// List.Cons
// List.Nil
import week3._

object nth{

    def nth[T](n: Int, xs: List[T]): T = 
        if (xs.isEmpty) throw new IndexOutOfBoundsException
        else if (n == 0) xs.head
        else nth(n - 1, xs.tail)

 def main(args: Array[String]){

    val list = new Cons(1, new Cons(2, new Cons(3, new Nil)))
    println(list)
    println(nth(2, list))
    // will throw IndexOutOfBoundsException
    println(nth(4, list))
    println(nth(-1, list))

 }
}