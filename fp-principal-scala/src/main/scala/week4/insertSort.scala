
package week4

object insertSort{
    def insert(x: Int, xs: List[Int]): List[Int] = xs match {
      case List => List(x)
      case y :: ys => if (x <= y) x :: xs else y :: insert(x, ys)
    }

   def main(args: Array[String]){
   }
}