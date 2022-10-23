//Modify the program you made last time in Exercise 1.05 so that it now
//asks the user to input the sales tax, and the prices for the three items.
//Then calculate and print out the tax and total prices like before.



import java.util.Scanner;
public class Excercise10
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the price of a first product");
    double first = keyboard.nextDouble();

    System.out.println("Enter the price of second product");
    double second =keyboard.nextDouble();

    System.out.println("Enter the price of third product");
    double third = keyboard.nextDouble();

    System.out.println("Enter the tax ");
    double tax = keyboard.nextDouble();

    double taxFirst = tax * first;
    double taxSecond = tax * second;
    double taxThird = tax * third;
    double totalFirst = taxFirst + first;
    double totalSecond = taxSecond + second;
    double totalThird = taxThird + third;

    System.out.println("The tax of the first product is " + taxFirst);
    System.out.println("The tax of second product is " + taxSecond);
    System.out.println("The tax of third product is " + taxThird);
    System.out.println("The total price of first product after tax is " + totalFirst);
    System.out.println("The total price of seconf product after tax is " + totalSecond);
    System.out.println("The total price of third product after tax is " + totalThird);
  }
}
