//Need this for random
import scala.util._

object Game extends App
{
  //define all variables game will be using
  var smallest = 0;
  var biggest = 100;
  val guess = new Random().nextInt(biggest)
  var userGuess = 0
  var counter = true
  var lives = 5

  //inform user how many lives they have initially
  println("Guess a number between " + smallest + " and " + biggest)

  //while loop checks if counter is true, and if enough lives are present
  //if both are valid, the user can continue playing
  while (counter && lives != 0) {
    println("Lives remaining: " + lives)
    println("What is your guess?")
    userGuess = readInt()

    //Logic for game, checking if the guess is right
    if(userGuess > guess){
      println("Your guess was too high.")
      lives = lives - 1
    }else if(userGuess < guess){
      println("Your guess was too low.")
      lives = lives - 1
    }else{
      println("Congrats you guessed right!")
      counter = false
      lives = 0
    }
  }
  //Announces game over if lives are at 0
  if (lives == 0){
    println("You ran out of lives. Game over")
  }
}
