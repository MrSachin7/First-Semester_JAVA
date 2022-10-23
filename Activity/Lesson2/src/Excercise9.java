//Write an application that reads three integers from the keyboard and
//displays the sum and the product on the screen.

import java.util.Scanner;

public class Excercise9
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter the first number");
    double first = keyboard.nextDouble();

    System.out.println("Enter the second number");
    double second = keyboard.nextDouble();

    System.out.println("Enter the third number");
    double third = keyboard.nextDouble();

    double sum = first + second + third;
        double product = first *second * third;

        System.out.println("The sum of numbers is " + sum + "and the product of numbers is " + product );


  }


}




