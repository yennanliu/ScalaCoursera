
package week5

object MultiplyListElement{
    def scaleList(xs : List[Double], factor: Double): List[Double] = xs match {
        case Nil => xs
        case y :: ys =>  y * factor :: scaleList(ys, factor)
    }

 def main(args: Array[String]){
    val fruit = List("apple", "orange", "pear")
    val nums =  List(1.2, 2.4, 3.9)
    val diag3 = List(List(1,0,0), List(0,1,0), List(0,0,0))
    val empty = List()
    val factor = 2.1

    println("nums :" , nums)
    println(scaleList(nums, factor))
  }
}