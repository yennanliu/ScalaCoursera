// https://www.coursera.org/learn/progfun2/lecture/S7NQA/lecture-1-3-functional-random-generators

package week1

object RandomTreeGenerators{

    // define Generator
    trait Generator[+T] {
      self =>

      def generate: T

      def map[S](f: T => S): Generator[S] = new Generator[S]{
        def generate = f(self.generate)
      }

      def flatMap[S](f: T => Generator[S]): Generator[S] = new Generator[S]{
        def generate = f(self.generate).generate
        }
    }

    // implement Generator to tree
    trait Tree

    case  class Inner(left: Tree, right: Tree) extends Tree
        
    case  class Leaf(x: Int) extends Tree


    def main(args: Array[String]){ 
        println("RandomTreeGenerator")

        val integers = new Generator[Int] {
            def generate = scala.util.Random.nextInt()
        }
        
        val booleans = integers.map( _ >= 0)

        def leafs: Generator[Leaf] = for {
            x <- integers
        } yield Leaf(x)

        def inners: Generator[Inner] = for {
            l <- trees
            r <- trees
        } yield Inner(l, r)

        def trees: Generator[Tree] = for {
            isLeaf <- booleans
            tree <- if (isLeaf) leafs else inners
        } yield tree

     for (i <- 1 to 5)
        println("i =  " + i + trees.generate)

     // println(trees.generate)
     }

}