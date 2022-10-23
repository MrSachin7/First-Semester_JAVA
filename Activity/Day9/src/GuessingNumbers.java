//Guess a number part 2. Write a program that generates a random number between 1 and
//1000, and then asks the user to try and guess it. Every time the user makes a wrong guess,
//display whether the guess was too high or too low, and ask the user to make another
//guess. When the user guesses the right number, display how many attempts were needed.

import java.util.Scanner;
import java.util.Random;

public class GuessingNumbers
{
  public static void main(String[] args)
  {
    Random randomNumbers = new Random();
    Scanner keyboard =new Scanner(System.in);
    int randomNumber = randomNumbers.nextInt(1000)+1;
    int guess;
    do
    {
      System.out.println("Enter a guess");
      guess = keyboard.nextInt();
      if (guess == randomNumber)
      {
        System.out.println("Goodness gracious that was unbelievable .You are correct");
      }
      else if (guess <randomNumber)
      {
        System.out.println("I know this is hard mate, Hint : try entering bigger number");
      }
      else
      {
        System.out.println("I know this is hard mate, Hint : try entering smaller number");
      }

    }while (guess != randomNumber);


  }


}
