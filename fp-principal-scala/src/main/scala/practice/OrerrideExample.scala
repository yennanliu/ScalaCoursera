
package practice

object OrerrideExample{

    abstract class Base{
        def foo = 1 
        def bar : Int
    }

    class Sub extends Base {
        override def foo = 2 
        def bar = 3 
    }

 def main(args: Array[String]){

    val x = new Sub
    println (x.foo)

    }
 }