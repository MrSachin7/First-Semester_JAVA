//Write a program that asks a user to enter a number within the range 1-10. The program should then
//display the Roman numeral version of the entered number. If the number is outside the range 1-10,
//the program should display an error message of your choice. The first ten Roman numerals are {I, II,
//III, IV, V, VI, VII, VIII, IX, X}.

import java.util.Scanner;
public class Roman
{
  public static void main(String[] args)
  {

    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the number from 1 to 10 ");
    int choice = keyboard.nextInt();
    keyboard.nextLine();
    String roman;

    if (choice == 1)
    {
      roman = "I";
    }
    else if (choice == 2)
    {
      roman = "II";
    }
    else if (choice == 3)
    {
      roman = "III";
    }
    else if (choice == 4)
    {
      roman = "IV";
    }
    else if (choice == 5)
    {
      roman = "V";
    }
    else if (choice == 6)
    {
      roman = "VI";
    }
    else if (choice == 7)
    {
      roman = "VII";
    }
    else if (choice == 8)
    {
      roman = "VIII";
    }
    else if (choice == 9)
    {
      roman = "IX";
    }
    else if (choice == 10)
    {
      roman = "X";
    }
    else
    {
      roman ="This program cannot calculate more than 10 ";
    }
    System.out.print(roman);
  }
}
