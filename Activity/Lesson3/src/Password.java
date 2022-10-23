//Write a program that asks the user to enter a username, a password and a confirmation password.
//Then print out the username, and a message about whether or not the entered password and
//confirmation password are identical.

import java.sql.SQLOutput;
import java.util.Scanner;
public class Password
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the username ");
    String username = keyboard.nextLine();

    System.out.println("Enter  password ");
    String password =keyboard.nextLine();

    System.out.println("Confirm your password");
    String confirmPassword =keyboard.nextLine();

    if (password.equals(confirmPassword))
    {
      System.out.println("You can go to next step");
    }
    else
    {
      System.out.println("Password and confirmation password does not match.");
    }
  }
}
