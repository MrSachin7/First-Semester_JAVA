//Write a program that:
//a) Reads 4 integers from keyboard and stores them into an array (array1).
//b) Reads 4 more integers from keyboard and stores them into another array (array2).
//c) Creates a new array with the same length (sumArray).
//d) Uses a loop to store the sum of each element pair in the two arrays in sumArray.
//Example1: array1={1, 2, 3, 4} and array2{1, 2, 4, 5} makes sumArray={2, 4, 7, 9}

import java.util.Scanner;

public class ArraySum
{
    public static void main(String[] args)
    {
      Scanner keyboard = new Scanner(System.in);
      int[] array1 = new int[4];
      int[] array2 = new int[4];
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
      int[] sumArray=new int[array1.length];
      for (int i =0;i< sumArray.length ;i++)
        {
          sumArray[i]=array1[i]+array2[i];
          System.out.print(sumArray[i]+" ");

        }
      }
}
