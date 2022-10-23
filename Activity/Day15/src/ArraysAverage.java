//Write a program that reads 5 integers from keyboard and stores them in an array. Then use
//a loop to calculate the average value of the integers, and after the loop print out the result.

import java.util.Scanner;
public class ArraysAverage
{
  public static void main(String[] args)
  {
    Scanner keyboard =new Scanner(System.in);
    int[] numbers =new int[5];
    double average =0;
    int total =0;
    for (int i =0;i< numbers.length;i++)
    {
      System.out.println("Enter the number ");
      numbers[i]=keyboard.nextInt();
    }
    for (int i=0 ;i< numbers.length;i++)
    {

      total =total +numbers[i];

      average =(double)total/ numbers.length;
    }
    System.out.println("The average is "+average);
  }
}
