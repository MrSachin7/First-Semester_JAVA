import java.util.Scanner;
public class AgeTest
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter age");
    int age = keyboard.nextInt();
    keyboard.nextLine();
    String type;
    if (age < 0)
    {
      type = "Error in age value";
    }
    else if (age <= 12)
    {
      type = "Child";
    }
    else if (age <= 19)
    {
      type = "Teenager";
    }
    else if (age <= 65)
    {
      type = "Adult";
    }
    else
    {
      type = "Senior Citizen";
    }
    System.out.println(type);
  }

}
