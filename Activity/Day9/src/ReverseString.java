//Write a program that prompts the user for a string, and prints its reverse. E.g. the string
//"Hello" typed on the keyboard will be printed out as "olleH". Keep doing this over
//and over, until the user enters the string "quit".
import java.util.Scanner;

public class ReverseString
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    String quit = "QUIT";
    String input;
    do
    {
      System.out.println("\nEnter the String");
       input = keyboard.nextLine();
      int length = input.length();
      if((!input.toUpperCase().equals(quit)))
      {
        for (int i = (length - 1); i >= 0; i--)
        {
          char a = input.charAt(i);
          System.out.print(a);

        }
      }
    }
    while ((!input.toUpperCase().equals(quit)));

  }
}

