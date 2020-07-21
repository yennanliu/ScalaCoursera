// https://www.coursera.org/learn/progfun1/lecture/5vUiM/lecture-6-5-putting-the-pieces-together

package week6

import scala.io.Source

object PuttingPiecesTogether{

 def main(args: Array[String]){
    val in = Source.fromURL("http://lamp.epfl.ch/files/content/sites/lamp/files/teaching/progfun/linuxwords")
    
    //val words = in.getLines.toList

    val words = in.getLines.toList filter (word => word forall (chr => chr.isLetter))


    val mnem = Map(
      '2' -> "ABC", '3' -> "DEF", '4' -> "GHI",
      '5' -> "JKL", '6' -> "MNO", '7' -> "PQRS",
      '8' -> "TUV", '9' -> "WXYZ"
    )

    val charCode: Map[Char, Char] = 
      for ((digit, str) <- mnem; ltr <- str) yield ltr -> digit

    def wordCode(word: String): String =
      word.toUpperCase map charCode

    // test
    println(wordCode("JAVA"))
    println(wordCode("java"))

    def wordsForNum: Map[String, Seq[String]] =
      // withDefaultValue : defult value 
      words groupBy wordCode withDefaultValue Seq()

    def encode(number: String): Set[List[String]] = 
      if (number.isEmpty) Set(List())
      else {
        for {
          split <- 1 to number.length
          word <- wordsForNum(number take split)
          rest <- encode(number drop split)
        } yield word :: rest
      }.toSet

    // test
    encode("7225247386")
    println(encode("7225247386"))

 }
}