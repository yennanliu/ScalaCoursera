
package week5

object PositiveListElement{
    def PosElems(xs : List[Int]): List[Int] = xs match {
        case Nil => xs
        // if y > 0 : then include y to the result list, and move to the next element (ys)
        // else : move to the next element (ys) directly  
        case y :: ys =>  if (y > 0) y :: PosElems(ys) else PosElems(ys)
    }

 def main(args: Array[String]){
    val fruit = List("apple", "orange", "pear")
    val nums =  List(100, -99, 0, 1, 2, -234, -989)
    val diag3 = List(List(1,0,0), List(0,1,0), List(0,0,0))
    val empty = List()
    val factor = 2.1

    println("nums :" , nums)
    println(PosElems(nums))
  }
}