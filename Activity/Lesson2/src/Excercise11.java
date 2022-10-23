//Write an application that uses a Scanner object, to read your name, age
//and address. Afterwards the application should display the information on the screen.

import java.util.Scanner;
public class Excercise11
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter your name");
    String name = keyboard.nextLine();

    System.out.println("Enter your age");
    int age = keyboard.nextInt();
         keyboard.nextLine();

    System.out.println("Enter your address");
    String address= keyboard.nextLine();

    System.out.print("The name is "+name+ "\n The age is" + age + "\n The address is " + address);
  }
}
