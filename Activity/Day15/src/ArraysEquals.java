//Write a program that:
//a) Reads 4 integers from keyboard and stores them into an array (array1).
//b) Reads 4 more integers from keyboard and stores them into another array (array2).
//c) Uses a loop to check if the two arrays are identical, i.e. all elements at the same
//position in the two arrays must be the same.
//Example1: array1={1, 2, 3, 4} and array2{1, 2, 4, 5} are NOT identical.
//Example2: array1={10, 20, 30, 40} and array2{10, 20, 30, 40} are identical.

import java.util.Scanner;

public class ArraysEquals
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    int[] array1 = new int[4];
    int[] array2 = new int[4];
    boolean arraysEqual = true;
    for (int i = 0; i < array1.length; i++)
    {
      System.out.println("Enter numbers for array1");
      array1[i] = keyboard.nextInt();
    }
    for (int i = 0; i < array2.length; i++)
    {
      System.out.println("Enter the numbers for array2 ");
      array2[i] = keyboard.nextInt();
    }
    if (array1.length != array2.length)
    {
      arraysEqual = false;
    }
    else
    {
      for (int i = 0; i < array1.length; i++)
      {
        if (array1[i] != array2[i])
        {
          arraysEqual = false;
          break;
        }
      }
    }
    if (arraysEqual)
    {
      System.out.println("The arrays are equal.");
    }
    else
    {
      System.out.println("The arrays are not equal.");
    }
  }
}
