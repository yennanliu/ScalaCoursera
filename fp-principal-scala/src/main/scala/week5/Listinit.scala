
package wee5

object Listinit{

    def init[T](xs: List[T]): List[T] = xs match {
      case List() => throw new Error("init of empty list")
      case List(x) => List()
      case y :: ys =>  y :: init(ys)
    }

 def main(args: Array[String]){
    val a = List(1,2,3,4)
    println(a)
    println(init(a))
    val b = List()
    println(b)
    println(init(b))
    }
}