//Write a program that asks user to enter three test scores. The program must be
// display all the scores as well as the average score.

import java.util.Scanner;

public class Excercise12
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter the first test score");
    double first = keyboard.nextDouble();

    keyboard.nextLine();

    System.out.println("Enter the second test score ");
    double second = keyboard.nextDouble();

    keyboard.nextLine();

    System.out.println("Enter the third test score ");
    double third = keyboard.nextDouble();

    keyboard.nextLine();

    double average = (first + second + third) / 3;
    System.out.println(
        "The score of first, second and third tests are " + first + ", "
            + second + ", " + third + "respectively.");
    System.out.println("The average score is " +average);

  }
}
