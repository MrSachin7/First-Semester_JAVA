import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile
{
  public static void main(String[] args)
  {
    Scanner read=null;
    Scanner keyboard =new Scanner(System.in);
    System.out.println("Enter the name of file");
    String fileName =keyboard.nextLine();
    try
    {
      FileInputStream fileIn =new FileInputStream("Files/"+fileName+".txt");
      read =new Scanner(fileIn);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found, or could not be opened.");
      System.exit(1);
    }
    System.out.println("Text in file are as follows");
    while (read.hasNext())
    {
      System.out.println(read.nextLine());
    }
    read.close();

  }
}
