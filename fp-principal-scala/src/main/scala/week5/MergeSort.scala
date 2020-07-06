
package week5

object MergeSort{
    def msort(xs : List[Int]): List[Int] = {
        val n = xs.length/2
        if (n == 0) xs
        else {
            def merge(xs: List[Int], ys: List[Int]): List[Int] = (xs, ys) match {
                case (Nil, ys) => ys
                case (xs, Nil) => xs
                case (x :: xs1, y :: ys1) =>
                  // if x < y, so just x + y  (x is smaller)
                  if (x < y) x :: merge(xs1, ys)
                  // if x > y, so just y + x (y is smaller)
                  else y :: merge(xs, ys1) 
            }
            val (fst, snd) = xs splitAt n 
            merge(msort(fst), msort(snd))
        }
    }

 def main(args: Array[String]){
    val a = List(1,2,3,4)
    val b = List(4,3,2,1)
    val c = List()
    println(a)
    println(msort(a))
    println(msort(b))
    println(msort(c))
  }
}