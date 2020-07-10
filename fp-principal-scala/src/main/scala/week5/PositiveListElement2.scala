
// package week5

// object PositiveListElement2{
//     abstract class List[T]{
//         def filter(p : T => Boolean): List[T] = this match {
//             case Nil => this
//             case x :: xs => if (p(x)) x :: xs.filter(p) else xs.filter(p)
//         }
//     }
//     def PosElems(xs: List[Int]): List[Int] =
//         xs filter(x => x > 0)

//  def main(args: Array[String]){
//     val fruit = List("apple", "orange", "pear")
//     val nums =  List(100, -99, 0, 1, 2, -234, -989)
//     val diag3 = List(List(1,0,0), List(0,1,0), List(0,0,0))
//     val empty = List()
//     val factor = 2.1

//     println("nums :" , nums)
//     println(PosElems(nums))
//   }
// }