//Write a program that generates a random number between 1 and 10, and then asks the
//user to try to guess it. When the user enters a guess, compare it with the random generated
//number, and then tell the user if the guess was correct, or not.

import java.util.Scanner;
import java.util.Random;

public class RandomnNess
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    Random randomNumber = new Random();
    int number = randomNumber.nextInt(10)+1;

    System.out.println("Guess the number ");
    int guess = keyboard.nextInt();
    keyboard.nextLine();

    if (number == guess)
    {
      System.out.println("Oh my god , you are a genius");
    }
    else
    {
      System.out.println("You are a loser as expected ,the correct answer was "+ number);
    }
  }
}
