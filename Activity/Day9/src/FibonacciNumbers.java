public class FibonacciNumbers
{
  public static void main(String[] args)
  {
    int a = 0;
    int b = 1 ;
    int c ;
    for (int i =0; i<=20 ; i++)
    {
      System.out.println("Fibonanacci (" + (i) + ") =" + (b));

      //c  = a +b;
      //a = b;
      //b=c; we can do it either way....

      b=a+b;
      a=b-a;
      }
    }




  }

