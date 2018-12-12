object Main extends App {

  //This is a comment. Like java "//" are used

  //println is used to output to the console
  println("Hello, World!")

  //Define variables and values here
  //val is a immutable variable that cannot be changed
  //scala is case sensitive so greeting and Greeting are different variables
  val greeting = "Hello everyone!"
  val Greeting = "See, grammar is important"

  //output the variables
  println(greeting)
  println(Greeting)

  //Class is made like this, the name of the class must be capitalized
  class MyFirstProgram{
  //function is made like this, function name must be lowercase
  def myFirstMethod(args: Array[String]){
    val greeting = "Hello everyone!"
    val Greeting = "See, grammar is important"
    println(greeting)
    println(Greeting)
      }
    }

    //var is a mutable variable and can be changed
    var myVar : String = "I can be changed."

    //val is a immutable variable and cannot be changed
    val myVal : String = "I cannot be changed."

    //if and if else example
    var x = 15

    if( x == 10 ){
      println("Value of X is 10");
    } else if( x == 15 ){
      println("Value of X is 15");
    } else if( x == 20 ){
      println("Value of X is 20");
    } else{
      println("Opps something is wrong here");
    }

    var s = 0
    //while loop example
    val word = "Hey guys. This is a while loop!";
    while( s <= 0 ){
       println( word );
       s = s + 1
    }

    //for loop example
    var f = 0
    for (f<- 1 to 10){
       println( f );
    }
}
