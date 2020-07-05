
package week5

object ListRemoveAt{
    // take the first n elements, and drop n+1 elements
    def removeAt(n: Int, xs: List[Int]) = (xs take n) ::: (xs drop n + 1)

 def main(args: Array[String]){
    val fruit = List("apple", "orange", "pear")
    val nums = List(1,2,3)
    val diag3 = List(List(1,0,0), List(0,1,0), List(0,0,0))
    val empty = List()

    println(removeAt(0, nums))
    println(removeAt(1, nums))
    println(removeAt(2, nums))
    println(removeAt(3, nums))
  }
}