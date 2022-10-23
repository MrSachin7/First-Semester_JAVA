import java.io.*;
import java.util.Scanner;

public class BinaryReader
{
  public static void main(String[] args)
  {
    Scanner keyboard=new Scanner(System.in);
    System.out.println("Enter the name of file you want to open");
    String fileName= keyboard.nextLine();

    try
    {
      FileInputStream fileIn =new FileInputStream("Files/"+fileName+".bin");
      ObjectInputStream read = new ObjectInputStream(fileIn);
      while (true)
      {
        try
        {
          int x = read.readInt();
          System.out.println(x);
        }
        catch (EOFException eof)
        {
          System.out.println("End of file");
          break;
        }
      }
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found, or cannot be opened");
      System.exit(1);
    }
    catch (IOException e)
    {
      System.out.println("IO Error Reading file");
      System.exit(1);
    }
  }
}
