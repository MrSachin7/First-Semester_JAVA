//Write a program that asks the user for a username, a password and a confirmation
//password. Keep asking the user until the password and confirmation passwords match.
//Then print out the entered username and password and exit.

import java.util.Scanner;

public class Username
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    String username;
    String password;
    String confirmPassword;
    System.out.println("Enter the username");
    username = keyboard.nextLine();
    do
    {
      System.out.println("Enter the password ");
      password = keyboard.nextLine();

      System.out.println("Confirm your password  ");
      confirmPassword = keyboard.nextLine();
      if (!password.equals(confirmPassword))
      {
        System.out.println(
            "The password and confirm password do not match . Please try again ");
      }
      else
      {
        System.out.println("Go to next page");
      }

    }
    while (!password.equals(confirmPassword));
  }

}
