// 1st version of Sum 

package week2

object Sum{

 def main(args: Array[String]){

    def sum(f: Int => Int, a: Int, b: Int): Int = {
          
          def loop(a: Int, acc: Int): Int = {
            if (a > b) acc 
            else loop(a + 1, f(a) + acc)
          }
    loop(a, 0)
    }

    sum(x => x * x, 3, 5)
    sum(x => x * x * x, 3, 5)
 }
}