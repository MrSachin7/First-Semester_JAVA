import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Scanner;

public class NameWriter implements Serializable
{
  public static void main(String[] args)
  {
    PrintWriter write = null;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the file name");
    String fileName=keyboard.nextLine();

    try
    {
      FileOutputStream fileOut = new FileOutputStream("Files/"+fileName+".txt");
      write = new PrintWriter(fileOut);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found , or could not be opened");
      System.exit(1);
    }
    System.out.println(
        "Fasten your seatbelt, The process of writing has been started");

    String input = "";
    while (!(input.equals("DONE")))
    {
      System.out.println(
          " Enter the name of friend.....Write DONE all uppercase to stop");
      input = keyboard.nextLine();
      if (!input.equals("DONE"))
      write.println(input);
    }
    write.close();
    System.out.println("Done Writing");
  }
}
