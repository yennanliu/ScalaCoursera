// https://www.coursera.org/learn/progfun2/lecture/zsnJ0/recap-functions-and-pattern-matching

package week1

object PatternMatchRecap{
 
 println("PatternMatchRecap")

 def main(args: Array[String]){

  val f : String => String = { case "ping" => "pong"}

  println(f("ping"))
  //println(f("abc"))  // will get a error

  // partial function
  val g : PartialFunction [String, String] = {case "ping" => "pong"}
  println(g("ping"))
  println(g.isDefinedAt("ping"))
  println(g.isDefinedAt("abc"))


 }
}