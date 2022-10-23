import java.util.Scanner;
public class LeapYearsIsBackButWithBang
{

    public static void main(String[] args)
    {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter the start year");
      int startYear = keyboard.nextInt();

      System.out.println("Enter the end year");
      int endYear = keyboard.nextInt();
      keyboard.nextLine();

      Mydate date1 =new Mydate(1,1,2000);
      int counter=0;
      for( int i = startYear; i<= endYear; i++)
      {
        date1.setYear(i);
        if( date1.isLeapYear())
        {
          counter++;
          System.out.println(i +" is a leap year");
        }

      }
      System.out.println("The number of leap years is "+ counter);

    }
  }
