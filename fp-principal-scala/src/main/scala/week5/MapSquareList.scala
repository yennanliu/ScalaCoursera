
package week5

object MapSquareList{
    def squareList(xs : List[Int]): List[Int] = xs match {
        case Nil => Nil
        case y :: ys =>  y * y :: squareList(ys)
    }

    def squareListMap(xs : List[Int]): List[Int] = 
        xs map( x => x * x )

 def main(args: Array[String]){
    val fruit = List("apple", "orange", "pear")
    val nums =  List(1,2,3)
    val diag3 = List(List(1,0,0), List(0,1,0), List(0,0,0))
    val empty = List()

    println("nums :" , nums)
    println(squareList(nums))
    println(squareListMap(nums))
  }
}