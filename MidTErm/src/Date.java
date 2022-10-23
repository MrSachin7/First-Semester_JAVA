public class Date
{
  private int day;
  private int month;
  private int year;

  public Date(int day,int month ,int year)
  {
    this.year=year;
    this.month=month;
    this.day=day;
  }
  public Date()
  {
    day=25;
    month=9;
    year=2002;
  }
  public void setDate(int day , int  month,int year)
  {
    this.day=day;
    this.month=month;
    this.year=year;
  }
  public Date copy()
  {
    Date temp = new Date(day,month,year);
    return temp;
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Date))
    {
      return false;
    }
    Date other = (Date)obj;
    return (other.month==month && other.day==day && other.year==year);
  }
  public String toString()
  {
    return "Day : "+day+" \n Month :"+month+"\n Year :"+year;
  }
}
