//Write an application that asks the user to input three values of type int,
// obtains them from the user and prints the product and sum of the first two
// integers and the quotient (division) and difference of so the second and third
// integer.

import java.util.Scanner;

public class Numbers
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the first number ");
    int first = keyboard.nextInt();
    keyboard.nextLine();
    System.out.println("Enter the second number ");
    int second = keyboard.nextInt();
    keyboard.nextLine();
    System.out.println("Enter the third number ");
    int third = keyboard.nextInt();
    keyboard.nextLine();
    int sum =first + second;
    int product = first * second;
    double quotient = (double)second  / third  ;
    int difference = second -third ;
    System.out.println("The product of first and second is " + product);
    System.out.println("The sum of first and second is " + sum);
    System.out.println("The quotient of second divided by third number is "+quotient);
    System.out.println("The differnce between second and third number is "+ difference);


  }

}
