import java.util.Scanner;

public class MathTest
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the value of a ");
    double a = keyboard.nextDouble();
    keyboard.nextLine();

    System.out.println("Enter the value of b ");
    double b = keyboard.nextDouble();
    keyboard.nextLine();

    System.out.println("Enter the value of c ");
    double c = keyboard.nextDouble();
    keyboard.nextLine();

    double d = (b*b)-(4*a*c);
    double x1;
    double x2;
    double x;

    if (d<0)
    {
      System.out.println("There is no solution");
    }
    else if (d==0)
    {
      x = (-b)/(2*a);
      System.out.println( "The solution is "+ x);
    }
    else
    {
      x1 = (-b+Math.sqrt(d))/(2*a);
      x2 = (-b-Math.sqrt(d))/(2*a);
      System.out.println("The solutions are "+x1 +"and "+ x2);
    }
  }
}
