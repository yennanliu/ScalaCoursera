package week4

object PatternMatching{
 def getMonthName(i : Int): String = {
    i match {
    case 1  => "January"
    case 2  => "February"
    case 3  => "March"
    case 4  => "April"
    case 5  => "May"
    case 6  => "June"
    case 7  => "July"
    case 8  => "August"
    case 9  => "September"
    case 10 => "October"
    case 11 => "November"
    case 12 => "December"
    case _  => "Invalid month"
} 
  }

 def main(args: Array[String]){
    println (getMonthName(1))
    println (getMonthName(2))
    println (getMonthName(999))
    for (i <- 0 until 12)
        println("i = "+ i + " month = " + getMonthName(i))
    }
}