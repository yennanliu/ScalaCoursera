# [ScalaCoursera](https://www.coursera.org/specializations/scala?fbclid=IwAR1gnEYd2wFF4v3LPMusnhB1GIxR0xgnxHyjdqF3iyIQmrRHPBoKGrl_VfA)
> Functional Programming in Scala Course 

- [Functional Programming Principles in Scala](https://github.com/yennanliu/ScalaCoursera/tree/master/fp-principal-scala)
	- [Call by name VS Call by value](https://github.com/yennanliu/ScalaCoursera/blob/master/doc/fp-principal-scala/call_by_value_call_by_name.md)
- [Functional Program Design in Scala](https://github.com/yennanliu/ScalaCoursera/tree/master/fp-design-in-scala)
- Parallel programming
- Big Data Analysis with Scala and Spark
- Functional Programming in Scala Capstone

## Quick start

### Build project template
```bash
# via Scala template : https://github.com/scala/scala-seed.g8
#sbt new scala/scala-seed.g8
sbt new scala/scala-seed.g8 -o fp-design-in-scala

# via CLI  https://alvinalexander.com/scala/how-to-create-sbt-project-directory-structure-scala/

```

### Run the scala scripts
```bash 
cd fp-principal-scala && sbt run
cd fp-design-in-scala && sbt run
``` 

### Run the scala console (REPT)
```bash 
cd fp-principal-scala && sbt console
cd fp-design-in-scala && sbt console
``` 

## Ref 

<details>
<summary>Ref</summary>

- Install Scala 
	- https://www.coursera.org/learn/progfun1/supplement/BNOBK/tools-setup-please-read
- Scala cheetsheet
	- https://www.coursera.org/learn/progfun1/supplement/Sauv3/cheat-sheet
	- https://github.com/lampepfl/progfun-wiki/blob/gh-pages/CheatSheet.md
- IntellJ tutorial
	- https://www.coursera.org/learn/progfun1/supplement/VuJFf/intellij-idea-tutorial
- SBT tutorial 
	- https://www.coursera.org/learn/progfun1/supplement/uV974/sbt-tutorial-and-submission-of-assignments-please-read
-  Tech in Scala to deal with the parallelism challenge
	- [Martin Odersky, "Working Hard to Keep It Simple"](https://www.youtube.com/watch?v=3jg1AheF4n0) - OSCON Java 2011
- Scala API (library) ref
	- https://www.scala-lang.org/api/current/
	- https://docs.scala-lang.org/api/all.html

</details>