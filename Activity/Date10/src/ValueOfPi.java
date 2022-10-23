import java.util.Scanner;

public class ValueOfPi
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the number of times you want the iteration to run");
    int a = keyboard.nextInt();
    double term = 0;
    double total= 0;
    double pi ;
    keyboard.nextLine();

    for (int i=1 ;i<=a; i++ )
    {
      term = ((1.00/((2*i)-1)));
      if((i%2)==0)
      {
        total = total -term;
      }
      else
      {
        total = total + term;
      }



    }
    pi = 4* total;
    System.out.println("The value of pi after "+a+" iteration is : "+pi);
  }
}
