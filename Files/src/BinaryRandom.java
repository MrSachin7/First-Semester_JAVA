import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Random;
import java.util.Scanner;

public class BinaryRandom
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("How many random integers you want to create?");
    int amount= keyboard.nextInt();
    keyboard.nextLine();
    System.out.println("Enter the name of the file ");
    String filename=keyboard.nextLine();
    Random randomNumbers = new Random();

    try
    {
      FileOutputStream fileOut =new FileOutputStream("Files/"+filename+".bin");
      ObjectOutputStream write = new ObjectOutputStream(fileOut);

      for (int i=0; i<=amount; i++)
      {
        write.writeInt(randomNumbers.nextInt(amount));
      }
      write.close();
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found, or could not be opened.");
      System.exit(1);
    }
    catch (IOException e)
    {
      System.out.println("IO Error writing to file");
      System.exit(1);
    }
    System.out.println("Done Writing");

  }
}
