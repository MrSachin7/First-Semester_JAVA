import java.text.DecimalFormat;
import java.util.GregorianCalendar;

public class Date
{
  private int day;
  private int month;
  private int year;

  public Date(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public boolean isBefore(Date date2)
  {
    if (date2.year > year)
    {
      return true;
    }
    else if (date2.year == year && date2.month > month)
    {
      return true;
    }
    else if (date2.year == year && date2.month == month && date2.day > day)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  private boolean isLeapYear()
  {
    if ((year % 4 == 0) && (year % 100 != 0))
    {
      return true;
    }
    else if (year % 400 == 0)
    {
      return true;
    }
    else
      return false;
  }

  private int daysInMonth()
  {
    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
        || month == 10 || month == 12)
    {
      return 31;
    }
    else if (month == 2 && isLeapYear())
    {
      return 29;
    }
    else if (month == 2)
    {
      return 28;
    }
    else if (month == 4 || month == 6 || month == 9 || month == 11)
    {
      return 30;
    }
    else
    {
      return 0;
    }
  }

  private void nextDay()
  {
    day++;
    if (day > daysInMonth())
    {
      month++;
      day = 1;
      if (month > 12)
      {
        year++;
        month = 1;
      }
    }
  }

  public int numberOfDaysUntil(Date date2)
  {
    int count = 0;
    Date temp = this.copy();
    if (!(temp.isBefore(date2)))
    {
      return 0;
    }
    else
    {
      {
        while ((temp.isBefore(date2)))
        {
          count++;
          temp.nextDay();
        }
      }
    }
    return count;
  }

  public static Date today()
  {
    GregorianCalendar currentDate = new GregorianCalendar();
    int currentDay = currentDate.get(GregorianCalendar.DATE);
    int currentMonth = currentDate.get(GregorianCalendar.MONTH) + 1;
    int currentYear = currentDate.get(GregorianCalendar.YEAR);
    return new Date(currentDay, currentMonth, currentYear);
  }

  public Date copy()
  {
    return new Date(day, month, year);
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Date))
    {
      return false;
    }
    else
    {
      Date other = (Date) obj;
      return other.day == day && other.month == month && other.year == year;
    }
  }

  public String toString()
  {
    DecimalFormat formatter = new DecimalFormat("00");
    return formatter.format(day) + "/" + formatter.format(month)+ "/" + formatter.format(year);
  }

}
