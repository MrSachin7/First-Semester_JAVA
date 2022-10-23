import java.util.Scanner;

public class Pracrise
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the number of month");
    int month = keyboard.nextInt();
    String monthName= "";

    switch (month)
    {
      case 1: monthName="January";
             break;
      case 2: monthName="February";
             break;
      case 3 : monthName="March";
             break;
      case 4 : monthName ="April";
             break;
      case 5 : monthName="May";
             break;
      case 6 : monthName ="June";
             break;
      case 7: monthName="July";

    }
    System.out.println("The month name is"+monthName);
  }
}
