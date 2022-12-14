import java.text.DecimalFormat;

public class Time
{
  private int hour;
  private int minute;
  private int second;

  public Time(int h, int m, int s)
  {
    hour = h;
    minute = m;
    second = s;
  }

  public Time(int totalTimeInSecond)
  {
    hour = (totalTimeInSecond / 3600);
    totalTimeInSecond = totalTimeInSecond - (hour * 3600);
    minute = totalTimeInSecond / 60;
    totalTimeInSecond -= (60 * minute);
    second = totalTimeInSecond;
  }

  public int convertToSecond()
  {
    return ((hour * 3600) + (minute * 60) + second);
  }

  public boolean isBefore(Time time)
  {
    if (this.convertToSecond() >= time.convertToSecond())
    {
      return false;
    }
    else
    {
      return true;
    }
  }

  public Time timeUntil(Time time2)
  {
    if (this.isBefore(time2))
    {
      int a = this.convertToSecond();
      int b = time2.convertToSecond();
      int difference = b - a;
      return new Time(difference);
    }
    else
      return new Time(0, 0, 0);
  }

  public Time copy()
  {
    return new Time(hour, minute, second);
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Time))
    {
      return false;
    }
    else
    {
      Time other = (Time)obj;
      return other.second==second && other.minute==minute && other.hour==hour;
    }
  }

  public String toString()
  {
    DecimalFormat formatter = new DecimalFormat("00");
    return formatter.format(hour)+":"+formatter.format(minute)+":"+formatter.format(second);
  }
}
