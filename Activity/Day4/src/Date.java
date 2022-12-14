public class Date

{
  private int day;
  private int month;
  private int year;

  public Date()
  {
    day =25;
    month =9;
    year = 2002;
  }

  public Date(int day , int month , int year)
  {
    this.day =day;
    this.month =month;
    this.year =year;
  }

  public void setDay(int d)
  {
    day = d;
  }

  public void setMonth(int m)
  {
    month = m;
  }

  public void setYear(int y)
  {
    year = y;
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
  public String toString()
  {
    return day+ "/"+month+"/"+year;
  }
}
