import javax.swing.*;

public class MyNumber
{
  private int number;

  public MyNumber(int number)
  {
    this.number = number;
  }

  public int getNumber()
  {
    return number;
  }

  public int getLastDigit()
  {
    if (number >= 0)
    {
      return (number % 10);
    }
    else
    {
      return (number % (-10));
    }

  }

  public int getFirstDigit()
  {
    int a;
    a = number;

    while (a >= 10 || a < -10)
    {
      if (a >= 0)
      {
        {
          a = (a / 10);
        }
      }
      else
      {
        a = (a / (-10));
      }
    }
    if (a > 0 || a < -10)
    {
      return a;
    }
    else
    {
      return a * (-1);
    }

  }

  public boolean isDivisibleBy(int anotherInt)
  {
    if ((number % anotherInt) == 0)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public int numberOfproperDivisors()
  {
    if (number>=0)
    {
      int count = 0;
      for (int i = 1; i < number; i++)
      {
        if (number % i == 0)
        {
          count++;
        }
      }
      return count;
    }
    else
    {
      return 0;
    }
  }

  public boolean isPrime()
  {
    return numberOfproperDivisors() == 1;
  }

  public String toString()
  {
    if (isPrime() == true)
    {
      return "\"" + number + "(a prime number)\"";
    }
    else
    {
      return "\"" + number + "\"";
    }
  }

  public MyNumber plus(MyNumber anotherNumber)
  {
    if (anotherNumber == null)
    {
      anotherNumber = new MyNumber(0);
    }


    return new MyNumber((number + anotherNumber.number));

  }
  public boolean isPerfectNumber()
  {
    int sum =0;
    for (int i = 1; i < number; i++)
    {
      if (number % i == 0)
      {

        sum = sum +i;
      }
    }
    return (sum==number);

  }
}

