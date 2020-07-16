// https://www.coursera.org/learn/progfun1/lecture/H3cKk/lecture-6-3-combinatorial-search-example

package week6

object nqueens{
    // main nqueens func
    def queens(n: Int): Set[List[Int]] = {
        def placeQueens(k: Int): Set[List[Int]] = 
            if (k == 0) Set(List())
            else
                for {
                    queens <- placeQueens(k - 1)
                    col <- 0 until n
                    if isSafe(col, queens)
                } yield col :: queens
        placeQueens(n)
    }

    // check if it's a validated move
    def isSafe(col : Int, queens: List[Int]): Boolean = {
        val row = queens.length
        val queensWithRow = (row - 1 to 0 by -1) zip queens
        queensWithRow forall {
            case (r, c) => col != c && math.abs(col - c) != row - r
        }
    }

    // help func does nqueens visualization
    def show(queens: List[Int]) = {
        val lines = 
            for (col <- queens.reverse)
                yield Vector.fill(queens.length)("* ").updated(col, "X ").mkString 
                  "\n" + (lines mkString "\n")
    }

 def main(args: Array[String]){
    println(queens(4))
    println(queens(4) map show)
    }
}