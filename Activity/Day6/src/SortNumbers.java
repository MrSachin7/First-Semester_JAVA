//Sort numbers:
//a) Write a program that asks the user to enter two numbers and prints the smallest of
//the numbers.
//b) Write a program that asks the user to enter two numbers and prints the numbers in
//sorted order (smallest number first).
//c) Write a program that asks the user to enter three numbers and prints the numbers
//in sorted order (smallest number first).
//d) (Optional) Write a program that asks the user to enter four numbers and prints the
//numbers in sorted order (largest number first).

import java.util.Scanner;

public class SortNumbers
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the first number ");

    double a=keyboard.nextDouble();
    keyboard.nextLine();

    System.out.println("Enter the second number ");
    double b = keyboard.nextDouble();
    keyboard.nextLine();

    System.out.println ("Enter the third number ");
    double c= keyboard.nextDouble();
    keyboard.nextLine();

    if (a>=b && a>=c && b>=c)
    {
      System.out.println( c + ","+  b+ ","+ a );
    }
    else if (a>=b && a>=c && b<=c)
    {
      System.out.println( b + ", "+c + ","+a );
    }
    else if (b>=a && b>= c && a>=c)
    {
      System.out.println(c+","+a+","+b);
    }
    else if (b>=a && b>=c && c>=a)
    {
      System.out.println(a +","+c +", "+b);
    }
    else if(c>=a && c>=b && a>=b)
    {
      System.out.println(b+","+a+", "+c);
    }
    else
    {
      System.out.println(a+","+b+","+c);
    }



  }
}
