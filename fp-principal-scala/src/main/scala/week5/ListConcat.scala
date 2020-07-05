
package wee5

object ListConcat{

    def concat[T](xs: List[T], ys: List[T]): List[T] = xs match {
        case List() => ys
        case z :: zs => concat(zs, ys)      
    }

 def main(args: Array[String]){
    val a = List(1,2,3,4)
    val b = List(5,6,7)
    val c = List()
    println(a)
    println(concat(a, b))
    println(concat(c, b))
  }
}