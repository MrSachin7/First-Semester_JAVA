public class MyDate
{
  private int day;
  private int month;
  private int year;

  public MyDate(int day, int month, int year)
  {
    this.day=day;
    this.year=year;
    this.month=month;
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
  public MyDate copy()
  {
    return new MyDate(day,month,year);
  }
  public String toString()
  {
    return "Day :"+day+"\n Month: "+month+"";
  }
}
