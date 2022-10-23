import java.util.GregorianCalendar;

public class MyDate

{
  private int day;
  private int month;
  private int year;

  public MyDate(int day, int month, int year)
  {
    this.year = year;
    if (month <= 12)
    {
      this.month = month;
    }
    else
      throw new IllegalDateException("The month is not valid");

    if (day <= daysInMonth())
      this.day = day;
    else
      throw new IllegalDateException(" The day is not valid");
  }

  public MyDate()
  {
    day = 1;
    month = 1;
    year = 2000;
  }

  public void setDay(int day)
  {
    if (day <= daysInMonth())
      this.day = day;
    else
      throw new IllegalDateException(" The day is not valid");
  }

  public void setMonth(int month)
  {
    if (month <= 12)
      this.month = month;
    else
      throw new IllegalDateException("The month is not vaid");
  }

  public void setYear(int year)
  {
    this.year = year;
  }

  public int getDay()
  {
    return day;
  }

  public int getMonth()
  {
    return month;
  }

  public int getYear()
  {
    return year;
  }

  public boolean isLeapYear()
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

  public int daysInMonth()
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

  public String getAstro()
  {
    if ((month == 3 && day >= 21) || (month == 4 && day <= 19))
    {
      return "Aries";
    }
    else if ((month == 4 && day >= 20) || (month == 5 && day <= 20))
    {
      return "Taurus";
    }
    else if ((month == 5 && day >= 21) || (month == 6 && day <= 20))
    {
      return "Gemini";
    }
    else if ((month == 6 && day >= 21) || (month == 7 && day <= 22))
    {
      return "Cancer";
    }
    else if ((month == 7 && day >= 23) || (month == 8 && day <= 22))
    {
      return "Leo";
    }
    else if ((month == 8 && day >= 23) || (month == 9 && day <= 22))
    {
      return "Virgo";
    }
    else if ((month == 9 && day >= 23) || (month == 10 && day >= 22))
    {
      return "Libra";
    }
    else if ((month == 10 && day >= 23) || (month == 11 && day <= 21))
    {
      return "Scorpio";
    }
    else if ((month == 11 && day >= 22) || (month == 12 && day == 21))
    {
      return "Sagittarius";
    }
    else if ((month == 12 && day >= 22) || (month == 1 && day <= 19))
    {
      return "Capricorn";
    }
    else if ((month == 1 && day >= 20) || (month == 2 && day <= 18))
    {
      return "Aquarius";
    }
    else if ((month == 2 && day >= 19) || (month == 3 && day <= 20))
    {
      return "Pisces";
    }
    else
      return "The input is invalid";

  }

  public String dayOfWeek()
  {
    int k;
    int j;
    int q;
    int h;
    int m;
    if (month == 1)
    {
      m = 13;
      k = (year - 1) % 100;
      j = year / 100;
      q = day;
      h = (q + (13 * (m + 1) / 5) + k + (k / 4) + (j / 4) + 5 * j) % 7;

    }
    else if (month == 2)

    {
      m = 14;
      k = (year - 1) % 100;
      j = year / 100;
      q = day;
      h = (q + (13 * (m + 1) / 5) + k + (k / 4) + (j / 4) + 5 * j) % 7;
    }
    else
    {
      m = month;
      k = year % 100;
      j = year / 100;
      q = day;
      h = (q + (13 * (m + 1) / 5) + k + (k / 4) + (j / 4) + 5 * j) % 7;

    }
    if (h == 0)
    {
      return "Saturday";
    }
    else if (h == 1)
    {
      return "Sunday";
    }
    else if (h == 2)
    {
      return "Monday";
    }
    else if (h == 3)
    {
      return "Tuesday";
    }
    else if (h == 5)
    {
      return "Thursday";
    }
    else if (h == 4)
    {
      return "Wednesday";
    }
    else
    {
      return "Friday";
    }
  }

  public String getMonthName()
  {
    String monthName;

    switch (month)
    {
      case 1:
        monthName = "January";
        break;

      case 2:
        monthName = "February";
        break;

      case 3:
        monthName = "March";
        break;

      case 4:
        monthName = "April";
        break;

      case 5:
        monthName = "May";
        break;

      case 6:
        monthName = "June";
        break;

      case 7:
        monthName = "July";
        break;

      case 8:
        monthName = "August";
        break;

      case 9:
        monthName = "September";
        break;

      case 10:
        monthName = "October";
        break;

      case 11:
        monthName = "November";
        break;

      case 12:
        monthName = "December";
        break;

      default:
        monthName = "The input is invalid";

    }
    return monthName;

  }

  public void nextDay()
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

  public void nextDays(int days)
  {
    day = day + days;
    for (int i = 0; i <= days; i++)
    {
      nextDay();
    }

  }

  public boolean isBefore(MyDate date2)
  {
    if (year < date2.year)
    {
      return true;
    }
    else if (year > date2.year)
    {
      return false;
    }

    else
    {
      if (month < date2.month)
      {
        return true;
      }
      else if (month > date2.month)
      {
        return false;
      }
      else
      {
        if (day < date2.day)
        {
          return true;
        }
        else
          return false;
      }
    }
  }

  public static MyDate today()
  {
    GregorianCalendar currentDate = new GregorianCalendar();
    int currentDay = currentDate.get(GregorianCalendar.DATE);
    int currentMonth = currentDate.get(GregorianCalendar.MONTH) + 1;
    int currentYear = currentDate.get(GregorianCalendar.YEAR);
    return new MyDate(currentDay, currentMonth, currentYear);
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof MyDate))
    {
      return false;
    }
    MyDate other = (MyDate) obj;
    return other.day == day && other.month == month && other.year == year;
  }

  public MyDate copy()
  {
    return new MyDate(day, month, year);

  }

  public String toString()
  {
    return "Day :" + day + "\n Month :" + month + "\n Year :" + year;
  }
}












