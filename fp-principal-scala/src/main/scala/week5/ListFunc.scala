
package week5

object ListFunc{
 def main(args: Array[String]){
    val nums = List(2, -4, 5, 7, 1, 0)

    println(nums filter( x => x > 0))
    println(nums filterNot( x => x > 0))
    println(nums partition( x => x > 0))
    println(nums takeWhile( x => x > 0))
    println(nums dropWhile( x => x > 0))
    println(nums span( x => x > 0))

  }
}