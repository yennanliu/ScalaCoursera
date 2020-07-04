
// package week4

// object insertSort{
//   // https://stackoverflow.com/questions/10406064/insertion-sort-implementation-in-scala

//   def isort(xs: List[Int]): List[Int] =
//     if (xs.isEmpty) Null
//     else insert(xs.head, isort(xs.tail))

//   def insert(x: Int, xs: List[Int]): List[Int] =
//     if (xs.isEmpty || x <= xs.head) x :: xs
//     else xs.head :: insert(x, xs.tail)

// def insert(x: Int, xs: List[Int]): List[Int] = xs match {
//       case List => List(x)
//       case y :: ys => if (x <= y) x :: xs else y :: insert(x, ys)
//     }

//    def main(args: Array[String]){
//    }
// }