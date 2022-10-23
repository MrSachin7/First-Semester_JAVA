

import  java.text.DecimalFormat;
import java.util.Scanner;

public class PiAgain


  {
    public static void main(String[] args)
    {
      double term = 0;
      double total= 0;
      double pi;
      int count=0;
      int i=1;
      DecimalFormat formatter = new DecimalFormat("0.00000");
      do
      {
        term = ((1.00/((2*i)-1)));
        if((i%2)==0)
        {
          total = total -term;
        }
        else
        {
          total = total + term;
        }
        pi= 4* total;
        i++;
        count++;
      }



      while( !formatter.format(pi).equals(formatter.format(Math.PI)));

      System.out.println("The value of pi is : "+ pi + "and it took "+ count+ " iteration to do so ");
  }}


