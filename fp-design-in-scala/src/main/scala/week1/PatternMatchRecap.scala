// https://www.coursera.org/learn/progfun2/lecture/zsnJ0/recap-functions-and-pattern-matching

package week1

object PatternMatchRecap{

 def main(args: Array[String]){

  val f : String => String = { case "ping" => "pong"}

  println("PatternMatchRecap")
  println(f("ping"))
  //println(f("abc"))  // will get a error

 }
}