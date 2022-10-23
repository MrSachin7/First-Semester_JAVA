//Write a program that asks the user to input an int, n, and then prints out the following:
//a) All the numbers 1, 2, 3, …, n
//b) All the numbers 2, 4, 6, …, 2*n
//c) All the numbers 1, 4, 9, …, n2

import java.util.Scanner;
public class SomeInsanelyBasicStuffs
{
  public static void main(String[] args)
  {
    System.out.println("Enter a number");
    Scanner keyboard = new Scanner(System.in);
    int n = keyboard.nextInt();
    for( int i = 1;i<=n;i++)
    {
      System.out.print(i +" ");

    }
    System.out.println();
    for(int i=1 ; i<=n ; i++)
    {
      System.out.print(2*i +" ");
    }
    System.out.println();
    for( int i =1 ; i<=n ; i++)
    {
      System.out.print(i*i + " ");
    }
  }


}
