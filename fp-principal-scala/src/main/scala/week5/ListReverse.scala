
package week5

object ListReverse{

    def reverse[T](xs: List[T]): List[T] = xs match {
        case List() => xs
        case y :: ys => reverse(ys) ++ List(y)   
    }

 def main(args: Array[String]){
    val a = List(1,2,3,4)
    val b = List(5,6,7)
    val c = List()
    println(a)
    println(reverse(a))
    println(reverse(c))
  }
}