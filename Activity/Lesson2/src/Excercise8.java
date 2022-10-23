import java.util.Scanner;
public class Excercise8
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter your favourite city");
    String cityName  = keyboard.nextLine();
    int strSize = cityName.length();
    String upper = cityName.toUpperCase();
    String lower = cityName.toLowerCase();
    char character = cityName.charAt(0);

    System.out.println("There are " + strSize + " characters in your city");
    System.out.println("The name of city in all uppercase letter is " + upper);
    System.out.println("The name of city in all lowercase letter is " + lower);
    System.out.println("The first character of your city is "+ character);


  }
}
