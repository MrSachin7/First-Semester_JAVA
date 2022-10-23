import java.util.Scanner;
public class PersonalityTest
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter sex M/F");
    String sexType = keyboard.nextLine();
    char sex = sexType.charAt(0);
    String type;

    System.out.println("Enter the age");
    int age = keyboard.nextInt();
    keyboard.nextLine();

    if ((sex != 'M' && sex != 'F') || (age<0) )
    {
      type ="Error";
    }

    else if (sex == 'M' && age < 18)
    {
      type = "Boy";
    }
    else if(sex =='M' && age>=18)
    {
      type ="Man";
    }
    else if (sex =='F' && age<18)
    {
      type = "Girl";
    }
    else
    {
      type ="Woman";
    }
    System.out.println(type);
  }
}
