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


    PayRoll payroll =new PayRoll();
    payroll.setName( name);
    payroll.setHours( hours);
    payroll.setPayRate(payRate);
    double grossPay = hours * payRate;
    payroll.setGrosspay(grossPay);

    System.out.println("The total salary is " + payroll.getGrossPay());


  }
}
