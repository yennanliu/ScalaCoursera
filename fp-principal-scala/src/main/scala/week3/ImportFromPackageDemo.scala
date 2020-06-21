
package week3

// import all method under week3
//import week3._

// some of entities are automatically imported in any Scala program
// They are 
// All members of package Scala
// All members of package java.lang
// All members of singleton object scala.Predef

object ImportFromPackageDemo{

	def error(msg: String) = throw new Error(msg)

 def main(args: Array[String]){

 	val x = new week3.rational.Rational(1,2)
 	println(x)

 	println(error("this is error msg"))

 }
}