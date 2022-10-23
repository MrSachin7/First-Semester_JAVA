//Write a program that reads a grade from the Danish 7-scale from keyboard (as an int) and
//prints the equivalent grade from the international grade scale.
//The Danish 7-scale grades are the following: {12, 10, 7, 4, 2, 0, -3} and the international
//grades are: {A, B, C, D, E, Fx, F}.
//The grades are converted as: 12=A, 10=B, 7=C, 4=D, 2=E, 0=Fx and -3=F
import java.util.Scanner;
public class Grade
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the international grade");
    String intGrade = keyboard.nextLine();
    int danishGrade;

    if (intGrade =="A")
    {
      danishGrade =12;
    }
    else if (intGrade == "B")
    {
      danishGrade = 10;
    }
    else if (intGrade =="C")
    {
      danishGrade = 7;
    }
    else if (intGrade=="D")
    {
      danishGrade=4;
    }
    else if (intGrade == "E")
    {
      danishGrade = 2;
    }
    else if (intGrade=="Fx")
    {
      danishGrade = 0;
    }
    else if (intGrade=="F")
    {
      danishGrade = -3;
    }
    else
    {
      danishGrade = 226;
    }
    System.out.println(danishGrade);

  }
}
