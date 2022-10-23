//Write a program that reads a grade from the Danish 7-scale from keyboard (as an int) and
//prints the equivalent grade from the international grade scale.
//The Danish 7-scale grades are the following: {12, 10, 7, 4, 2, 0, -3} and the international
//grades are: {A, B, C, D, E, Fx, F}.
//The grades are converted as: 12=A, 10=B, 7=C, 4=D, 2=E, 0=Fx and -3=F

import java.util.Scanner;
public class GradeDanish
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the Danish Grade");
    int danishGrade =keyboard.nextInt();
    keyboard.nextLine();
    String internationalGrades ;

    if (danishGrade==12)
    {
      internationalGrades = "A";
    }
    else if (danishGrade == 10 )
    {
      internationalGrades ="B";
    }
    else if (danishGrade ==7)
    {
      internationalGrades = "C";
    }
    else if (danishGrade == 4)
    {
      internationalGrades ="D";
    }
    else if (danishGrade== 2)
    {
      internationalGrades ="E";
    }
    else if (danishGrade==0)
    {
      internationalGrades ="Fx";
    }
    else if (danishGrade ==-3)
    {
      internationalGrades ="F";
    }
    else
    {
      internationalGrades ="not being able to calculated because the input invalid";
    }
    System.out.println("The equivalent international grade is " + internationalGrades);



  }
}
