
package week6

object ScalarProduct{
    // method 1 
    def ScalarProduct1(xs : Vector[Double], ys: Vector[Double]): Double = 
        (xs zip ys).map(xy => xy._1 * xy._2).sum
    // method2
    def ScalarProduct2(xs: Vector[Double], ys: Vector[Double]): Double = 
        (xs zip ys).map{ case (x, y) => x * y }.sum

 def main(args: Array[String]){
    val a = Vector(1.423,2.432,3.423,4.345)
    val b = Vector(0.00,100.435,99.4,3.14)
    println(a)
    println(b)
    println(ScalarProduct1(a, b))
    println(ScalarProduct2(a, b))

    }
}