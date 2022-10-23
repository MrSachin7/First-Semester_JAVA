import java.util.Scanner;
import java.util.Random;

public class SlotMachine
{
  public static void main(String[] args)
  {
    double money = 0.0;
    Scanner keyboard = new Scanner(System.in);
    Random randomness = new Random();
    String a = " ";
    String first = " ";
    String second = " ";
    String third = " ";
    String playAgain = "";
    String check = "YES";
    double moneyWon = 0;

    do
    {

      for (int i = 0; i < 3; i++)
      {
        int random = randomness.nextInt(6);
        if (random == 0)
        {
          a = "CHERRIES";
        }
        if (random == 1)
        {
          a = "ORANGES";
        }
        if (random == 2)
        {
          a = "PLUMS";
        }
        if (random == 3)
        {
          a = "BELLS";
        }
        if (random == 4)
        {
          a = "MELONS";
        }
        if (random == 5)
        {
          a = "BARS";
        }
        if (i == 0)
        {
          first = a;
        }
        if (i == 1)
        {
          second = a;
        }
        if (i == 2)
        {
          third = a;
        }

      }

      {
        System.out.println("Enter the money you want to bet ");
        money = keyboard.nextDouble();
        keyboard.nextLine();
        if (first == second && first == third)
        {
          moneyWon = 3 * money;
        }
        else if (first == second || first == third || second == third)
        {
          moneyWon = 2 * money;
        }

        else
        {
          moneyWon = 0;
        }


        System.out.println("You have won $" + moneyWon);
        System.out.println(first + "   " + second + "   " + third + "    ");
        System.out.println("Do you want to play again  YES/NO");
        playAgain = keyboard.nextLine();
        playAgain = playAgain.toUpperCase();
      }



    }while (playAgain.equals(check));
  }
}
