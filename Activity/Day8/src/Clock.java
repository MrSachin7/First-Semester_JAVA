import java.text.DecimalFormat;

public class Clock
{
  private int hour;
  private int minute;
  private int second;
  private boolean timeFormat24;

  public Clock(int h, int m, int s)
  {
    hour = h;
    minute = m;
    second = s;
    timeFormat24 = true;
  }

  public Clock(int totalTimeInSecond)
  {
    hour = (totalTimeInSecond / 3600);
    totalTimeInSecond = totalTimeInSecond - (hour * 3600);
    minute = totalTimeInSecond / 60;
    totalTimeInSecond -= (60 * minute);
    second = totalTimeInSecond;
    timeFormat24 = true ;
  }

  public void set(int h, int m, int s)
  {
    hour = h;
    minute = m;
    second = s;
  }

  public int getHour()
  {
    return hour;
  }

  public int getMinute()
  {
    return minute;
  }

  public int getSecond()
  {
    return second;
  }

  public void tic()
  {
    second += 1;
    if (second >= 60)
    {
      second = 0;
      minute += 1;
      if (minute >= 60)
      {
        minute = 0;
        hour += 1;
        if (hour >= 24)
        {
          hour = 0;
        }
      }
    }
  }

  public int convertToSecond()
  {
    return ((hour * 3600) + (minute * 60) + second);
  }

  public boolean isBefore(Clock time)
  {
    if (convertToSecond() >= time.convertToSecond())
    {
      return false;
    }
    return true;
  }

  public int timeInSecondsTo(Clock time)
  {
    if (convertToSecond() > time.convertToSecond())
    {
      return (convertToSecond() - time.convertToSecond());
    }
    else
    {
      return (time.convertToSecond() - convertToSecond());
    }
  }

  public Clock timeTo(Clock time)
  {
    int difference = timeInSecondsTo(time);
    Clock transfer = new Clock(difference);
    return transfer;

  }

  public String toString()
  {
    DecimalFormat formatter = new DecimalFormat("00");
    if (timeFormat24)
    {
      return formatter.format(hour) + ":" + formatter.format(minute) + ":" + formatter.format(second);
    }
    else if (!timeFormat24)
    {
      return formatter.format((hour - 12)) + ":" + formatter.format(minute) + ":"
          + formatter.format(second);
    }
    else
    {
      return "Pls go to school first , dont you know you cannot enter anything except 12 and 24 in time format ....What an idiot..";
    }

  }

  public boolean isTimeFormat24()
  {
    return timeFormat24;
  }

  public void setTimeFormat24(int hourFormat)
  {

    if (hourFormat == 24)
    {
      timeFormat24 = true;
    }
    if (hourFormat == 12)
    {
      timeFormat24 = false;

    }

  }
}
