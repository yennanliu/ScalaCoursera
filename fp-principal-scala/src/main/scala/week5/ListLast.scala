
package wee5

object ListLast{
    def last[T](xs: List[T]): T = xs match {
        case List() => throw new Error("last of empty list")
        case List(x) => x 
        case y :: ys => last(ys)
    }

 def main(args: Array[String]){
    val a = List(1,2,3,4)
    println(a)
    println(last(a))
    val b = List()
    println(b)
    }
}