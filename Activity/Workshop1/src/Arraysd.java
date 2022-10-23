import java.util.Scanner;
public class Arraysd
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int size = keyboard.nextInt();
    int[] integers = new int[size];
    for (int i=0;i<integers.length;i++)
    {
      System.out.println("Enter the number for "+i+" index");
      integers[i]=keyboard.nextInt();
    }
    int count=0;

    for (int i=0; i< integers.length;i++)
    {
      if (integers[i] ==7 || integers[i]==9 || integers[i]==13)
      {
        count++;
      }
    }
    if (count>0)
    {
      System.out.println("Contains no 7-9-13");
    }
    else
      System.out.println("Lucky");
  }
}
