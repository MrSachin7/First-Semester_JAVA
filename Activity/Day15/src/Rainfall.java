//1. Rainfall Class
//Write a RainFall class that stores the total rainfall for each of 12 months into an array of
//doubles. The program should have methods that return the following:
//● total rainfall for the year
//● the average monthly rainfall
//● the month with the most rain
//● the month with the least rain
//Demonstrate the class in a complete program.
//Input Validation: Do not accept negative numbers for monthly rainfall figures.

public class Rainfall
{
  private double[] rainfall;

  public Rainfall()
  {
    rainfall = new double[12];
    for (int i = 0; i < rainfall.length; i++)
    {
      rainfall[i] = -1;
    }
  }

  public void setRainfall(int month, double rain)
  {
    if (month >= 0 && rain >= 0)
    {
      rainfall[month-1] = rain;
    }
  }

  public double getTotalRainfall()
  {
    int total = 0;
    for (int i = 0; i < rainfall.length; i++)
    {
      if (rainfall[i] != -1)
      {
        total += rainfall[i];
      }
    }
    return total;

  }

  public double averageMonthlyRainfall()
  {
    int count = 0;
    double average = 0;
    for (int i = 0; i < rainfall.length; i++)
    {
      if (rainfall[i] >= 0)
      {
        count++;
      }

    }
    average = getTotalRainfall() / count;
    return average;

  }

  public String mostRain()
  {
    double highest = rainfall[0];
    int  month =0;
    for (int i = 0; i < rainfall.length; i++)
    {
      if (rainfall[i] > highest )
      {
        highest = rainfall[i];
        month=i;
      }
    }
    if (month == 0)
      return "January";
    else if (month == 1)
      return "February";
    else if (month == 2)
      return "March";
    else if (month== 3)
      return "April";
    else if (month == 4)
      return "May";
    else if (month == 5)
      return "June";
    else if (month == 6)
      return "July";
    else if (month == 7)
      return "August";
    else if (month == 8)
      return "September";
    else if (month == 9)
      return "October";
    else if (month == 10)
      return "November";
    else
      return "December";

  }

  public String leastRain()
  {
    {
      double lowest = rainfall[0];
      int month =0;
      for (int i = 0; i < rainfall.length; i++)
      {
        if (rainfall[i] < lowest && rainfall[i]!=-1)
        {
          lowest = rainfall[i];
          month =i;
        }
      }
      if (month == 0)
        return "January";
      else if (month == 1)
        return "February";
      else if (month == 2)
        return "March";
      else if (month == 3)
        return "April";
      else if (month == 4)
        return "May";
      else if (month == 5)
        return "June";
      else if (month == 6)
        return "July";
      else if (month == 7)
        return "August";
      else if (month == 8)
        return "September";
      else if (month == 9)
        return "October";
      else if (month == 10)
        return "November";
      else
        return "December";

    }

  }
}
