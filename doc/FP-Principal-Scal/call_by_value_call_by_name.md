# Callby_value VS Call_by_name

- https://stackoverflow.com/questions/13337338/call-by-name-vs-call-by-value-in-scala-clarification-needed
- `call-by-value` functions compute the passed-in expression's value before calling the function, thus the same value is accessed every time.
- `call-by-name` functions recompute the passed-in expression's value every time it is accessed.


## Example 1
```scala 
def something() = {
  println("calling something")
  1 // return value
}
```
```scala
def callByValue(x: Int) = {
  println("x1=" + x)
  println("x2=" + x)
}

def callByName(x: => Int) = {
  println("x1=" + x)
  println("x2=" + x)
}
```
so, we can see the difference between call by value & call by name : 

```scala
scala> callByValue(something())
calling something
x1=1
x2=1

scala> callByName(something())
calling something
x1=1
calling something
x2=1
```

-> So you can see that in the call-by-value version, the side-effect of the passed-in function call (something()) only happened once. However, in the call-by-name version, the side-effect happened twice.

This is because call-by-value functions compute the passed-in expression's value before calling the function, thus the same value is accessed every time. Instead, call-by-name functions recompute the passed-in expression's value every time it is accessed.

## Example 2 
```scala 
def test(x:Int, y:Int)= x*x
```

we want to examine the evaluation strategy and determine which one is faster (less steps) in these conditions: 

```scala
test (2,3)
```
call by value: test(2,3) -> 2*2 -> 4
call by name: test(2,3) -> 2*2 -> 4
-> Here the result is reached with the same number of steps.

```scala
test (3+4,8)
```
call by value: test (7,8) -> 7*7 -> 49
call by name: (3+4) (3+4) -> 7(3+4)-> 7*7 ->49
-> Here call by value is faster.

```scala
test (7,2*4)
```
call by value: test(7,8) -> 7*7 -> 49
call by name: 7*7 -> 49
-> Here call by name is faster

```scala
test (3+4, 2*4)
``` 
call by value: test(7,2*4) -> test(7, 8) -> 7*7 -> 49
call by name: (3+4)(3+4) -> 7(3+4) -> 7*7 -> 49
-> The result is reached within the same steps.
