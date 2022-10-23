import java.util.Scanner;

public class PayRollTest
{
  public static void main(String[] args)
  {
    Scanner keyboard =new Scanner(System.in);
    System.out.println("Enter name" );
    String name = keyboard.nextLine();

    System.out.println("Enter hours ");
    double hours = keyboard.nextDouble();
    keyboard.nextLine();

    System.out.println("Enter payrate");
    double payRate = keyboard.nextDouble();
    keyboard.nextLine();

    double grossPay =hours * payRate;

    PayRoll payRoll1 = new PayRoll();
        PayRoll payRoll2 = new PayRoll(name , hours , payRate , grossPay);
    System.out.println(payRoll1);
    System.out.println(payRoll2);




  }
}
