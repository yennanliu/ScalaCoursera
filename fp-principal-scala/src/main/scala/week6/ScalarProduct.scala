
package week6

object ScalarProduct{
    // method 1 : regular zip, map op
    def ScalarProduct1(xs : Vector[Double], ys: Vector[Double]): Double = 
        (xs zip ys).map(xy => xy._1 * xy._2).sum
    // method2 : pattern match
    def ScalarProduct2(xs: Vector[Double], ys: Vector[Double]): Double = 
        (xs zip ys).map{ case (x, y) => x * y }.sum

 def main(args: Array[String]){
    val a = Vector(10.0, 2.0, 3.0, 30.0)
    val b = Vector(0.00,100.0, -1.0, 20.0)
    println(a)
    println(b)
    println(a zip b)
    println(ScalarProduct1(a, b))
    println(ScalarProduct2(a, b))

    }
}