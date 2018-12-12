# _Scala_

- _Rameet Sekhon_
- _rameet.sekhon@uoit.net_

## About the language

> _Scala is a high level language that utilizes both object oriented and functional programming together. It runs on existing Java platform and has similar runtime to javascript._
>
> - Scala first began in 2001 at  École Polytechnique Fédérale de Lausanne by Martin Odersky in Switzerland. This language built upon Oderskys' previous work within Java, as well as Funnel. Scalas preliminary release was in 2003, followed by a public release in 2004. A revised secondary version was released in 2006. Moving forward to 2011, the Scala team won a 5 year research grant from the European Research Council and in 2011 Odersky launched Lightbend. Lightbend is a service to help train, and support people using Scala.

> - Scala was intended to be compiled using Java, and as a result the exe code runs on Java machines
> - Because of this compatibility with Java Scala is also suitable for Android development, which also is typically written in Java
> - Scala also has a javascript compiler which enables Scala to be run on web browsers

## About the syntax

> _Here are some snippets of common programs run on devices_

*Hello World*

```Scala
object Main extends App {
  println("Hello, World!")
}
```
> _From this snippet we can see that there are no semi colons at the end of each line like c++_
> _It has a similar structure to Javascript_

*Case sensitivity*

```Scala
  //Define variables and values here
  val greeting = "Hello everyone!"
  val Greeting = "See, grammar is important"

  //output the variables
  println(greeting)
  println(Greeting)
```
> _Scala is case sensitive so we can see here that the variable greeting is different than Greeting._
> _Comments in scala utilize // as we can see 2 comments have been inserted into the code._

*Class and functions*

```Scala
class MyFirstProgram{
def myFirstMethod(args: Array[String]){
  val greeting = "Hello everyone!"
  val Greeting = "See, grammar is important"
  println(greeting)
  println(Greeting)
    }
  }
```
> _Class names should also start with a capital letter such as: "MyFirstProgram"_
> _Function names should begin with a lower case such as: "myFirstProgram"_

*Mutable vs immutable*

```Scala
//var is a mutable variable and can be changed
var myVar : String = "I can be changed."

//val is a immutable variable and cannot be changed
val myVal : String = "I cannot be changed."
```
> _Mutable variables can be changed while immutable ones cannot_
> _Variable type is specified after the name of the variable is written_
> _By default var is set to Int, and val is set to String_

*Loops*

```Scala
//if loop example
if( x == 10 ){
  println("Value of X is 10");
} else if( x == 20 ){
  println("Value of X is 20");
} else if( x == 30 ){
  println("Value of X is 30");
} else{
  println("This is else statement");
}

//while loop example
val word = "Hey guys. My name is infinite loop";
while( true ){
   println( word );
}

//for loop example
var x = 0
val word = "Hey guys. My name is not infinite loop";
for (x<- 1 to 10){
   println( word );
}
```
> _Loops are the same as Java with if, for and while loops_
> _First example shows else-if loops with integer values_
> _Second example shows a while loop. In this case it will run forever as it is always true._
> _Third example shows a for loop. In this case it will run 10 times._

## About the tools

> _Compiling a Scala program requires the Java RunTime Environment and Scala to be installed_.
> - Java needs to be installed through the JDK
> - Next, `sbt` needs to be installed from the Scala website
> - Then open up `cmd` and `cd` into the folder where you want your code
> - Run the command `sbt new scala/hello-world.g8`
> - Name the application whatever you would like and a template should be created where you can begin coding
> - cd into your project and run type `sbt`
> - Type `~run` to run the program

## About the standard library

> _Scala has a large Standard library that with multiple functions to assist programmers.
> 3 of the most common data structures are List, Vector and Hashmap. Scala's STL provides functions for all 3 of these._
.
*List*
> - _This is the most basic data structure in programming. A list is simply having n elements with each having a index. In Scala Lists are immutable. Here is a small example of how Scala STL is used for Lists_
`val carBrands = List("BMW", "Ferrari", "Dodge")`
>- _A list can contain a list of lists as well as such:_
`val carBrandsAndModels = List(List("335", "535", "750li"), List("LaFerrari, Enzo"))`
`
*Vector*
> - _A vector is also immutable and a basic data structure. A vector is essentially a list that varies in the way you interact with data. In Scala Vectors are immutable. Here is a small example of how Scala STL is used for Vectors_
`val iceCreamFlavours: Vector[String] = Vector("Chocolate", "Strawberry", "Vanilla")`

*Hashmap*
> - _A hashmap is a data structure that contains key and value pairs . As values are inputted, keys are assigned to easily store and retrieve data. Here is a small example of how Scala STL is used for Hashmaps_
`val iceCreamFlavoursMap: HashMap[String, String] = HashMap(("C","Chocolate"),("S","Strawberry"),("V","Vanilla"))`

# About open source library

> _Scala has a limited open source library compared to more mature platforms such as java, javascript and c++/c#.
> Despite this there are excellent tools and resources that can assist developers in a variety of situations.
> One example of this is Apache Spark. Spark is a open source library that provides high level API for Scala.
> It deals with Big Data computation for graphs and further data analysis. It further extends this support
> to tools such as Spark SQL, MLIB that is used for machine learning, GraphX for graphs and SparkX for streams.
> Spark is built using Apache Maven and significantly expands Scala's ability in Big Data applications and is a perfect
> example of a open source library giving the community valuable tools to solve problems._

# Analysis of the language

*Functional vs Procedural Programming*
> _Scala is both a functional language, as well as a object oriented one. functional wise, Scala has anonymous functions, as well as many first class functions that make coding functionaly a lot easier. There is also many immutable collections libraries and tail recursion is supported. Moving onto Object oriented, Scala is based on Java and follows many of the same procedures giving users the option between Object oriented and Functional programming._.

*Meta Programming (Macros)*
> _Moving onto meta-programming, Scala 2.10 has built in support for macros however earlier versions did not. Metaprogramming refers to a variety of ways a program has knowledge of itself or can manipulate itself. Macros is an example of this. Before Scala 2.10 many used java imports for work arounds and metaprogramming was a experimental feature._.

*Symbol Resolution*
> _Symbol Resolution is a feature many functional languages use. Scala has support for these types. Symbol resolutions essentially moves the named symbols to their appropriate spots within the memory. The process identifies the symbols, and then evaluates their location within the memory address. Scala utilizes this and is supported for users._.

*Scoping Rules*
> _Scoping rules in Scala are lexical for the most part, but we can see dynamic scoping in anonymous functions. Lexical scope name resolution is dependent on the location in the source code whereas dynamic scoping is processed at runtime. Clojure is an example of dynamic scoping, as all name resolutions are handled at runtime_.

*Functional Programming*
>_We can see various Scala functional programming constructs through many built in functions both natively and in the STL including pattern matching, immutability, higher-order functions, currying and a few more. //Pattern matching is the ability to find keywords within a string with a keyword passed in as a argument. Immutability is keeping a variable static, therefore not being able to modify the value of that variable. Higher-order functions are functions that can take other functions as a parameter, or return a function as a result. Currying is a technique of taking a function that has many parameters, and outputting a function with just a single parameter._.

*Static vs Dynamic Types*
>_Scala is statically typed, however unlike other statically typed languages such as C/C++, Scala takes a middle of the road approach. This means the variable type does not need to be explicitly defined as Scala uses type-inference to fill in missing information. Although Scala has type-inference, it is still strongly typed meaning you cannot change variable types once defined. (Ex. int to string)._.

*Pros vs Cons*
>_Scala like any language has various pros and cons making it more suitable for certain applications. Since Scala is based on Java it shares many of the same pros and cons of that language_.
>
>_Pros_.
> - Uses both type-inference and statically typed to avoid run time errors while allowing flexibility
> - Both functional and object-oriented allowing users to approach problems both always
> - Large STL providing built in functionality making it easier to programs
> - Interoperability with Java means it is well suited for Android development
> - Supports Clojure
>
>_Cons_.
> - Runs on top of Java, therefore performance is limited compared to lower level languages
> - New releases of Scala are not fully compatible with previous version
> - Less mature compared to established languages
