// Scala Tree data structure demo

package week3

object intsets{

// abstract classes can contain members which 
// are missing an implementation 
// (in our case, incl and contains)
abstract class IntSet {
    def incl(x : Int): IntSet
    def contains(x : Int): Boolean
}

class Empty extends IntSet{
    def contains(x : Int): Boolean = false
    def incl(x : Int): IntSet = new NonEmpty(x, new Empty, new Empty)
    override def toString = "."
}

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet{
    def contains(x: Int): Boolean = 
        if (x < elem) left contains x 
        else if (x > elem) right contains x
        else true

    def incl(x : Int): IntSet = 
        if (x < elem) new NonEmpty(elem, left incl x, right)
        else if (x > elem) new NonEmpty(elem, left, right incl x)
        else this
    override def toString = "{" + left + elem + right + "}"
}

 def main(args: Array[String]){

    val t1 = new NonEmpty(3, new Empty, new Empty)
    println(t1)
    val t2 = t1 incl 4
    println(t2)

 }
}