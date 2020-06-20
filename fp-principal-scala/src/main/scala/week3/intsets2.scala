// Scala Tree data structure demo
// set Empty as "object" rather then "class" 
// so when call Empty, we can use "Empty" rather than "new Empty"

package week3

object intsets2{

// abstract classes can contain members which 
// are missing an implementation 
// (in our case, incl and contains)
abstract class IntSet {
    def incl(x : Int): IntSet
    def contains(x : Int): Boolean
}

object Empty extends IntSet{
    def contains(x : Int): Boolean = false
    def incl(x : Int): IntSet = new NonEmpty(x, Empty, Empty)
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

    val t1 = new NonEmpty(3, Empty, Empty)
    println(t1)
    val t2 = t1 incl 4
    println(t2)

 }
}