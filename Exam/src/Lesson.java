import java.util.ArrayList;

public class Lesson
{
  private String topic;
  private Date date;
  private Resource[] resources;
  private Time start;
  private Time end;

  public Lesson(String topic, Date date, Time start, Time end, Resource[] res)
  {
    if (!hasValidTime(start,end))
    // if(new Time(24, 0 , 0) isBefore(start) || new Time(24,0,0) isBefore(end))
    {
      throw new IllegalTimeException();

    }
    else
    {
      this.topic = topic;
      this.date = date.copy();
      resources = res;
      this.start = start.copy();
      this.end = end.copy();
    }
  }

  public String getTopic()
  {
    return topic;
  }

  public Date getDate()
  {
    return date.copy();
  }

  public Resource[] getResources()
  {
    return resources;
  }

  public ArrayList<Resource> getAllPDFs()
  {
    ArrayList<Resource> temp = new ArrayList<Resource>();
    for (int i = 0; i < resources.length; i++)
    {
      if (resources[i].isPDF())
      {
        temp.add(resources[i]);
      }
    }
    return temp;
  }

  public Time getDuration()
  {
    int startTime = start.convertToSecond();
    int endTime = end.convertToSecond();
    int difference = endTime - startTime;
    return new Time(difference);
  }

  public static boolean hasValidTime(Time startTime, Time endTime)
  {
    if ((endTime.isBefore(startTime)) || ((startTime
        .isBefore(new Time(8, 20, 20)))) || !(((endTime
        .isBefore(new Time(21, 10, 0))))))
    {
      return false;
    }
    else
    {
      return true;
    }
  }

  public String getDateTimeString()
  {
  return date.copy() + "  "+start.copy()+"-"+end.copy();
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Lesson))
    {
      return false;
    }
    else
    {
      Lesson other = (Lesson)obj;
      return other.topic.equals(topic) && other.end.equals(end) && other.start.equals(start) && other.topic.equals(topic) && other.resources.equals(resources) && other.date.equals(date);
    }
  }
  public String toString()
  {
    String temp = "Topic : "+topic+"        Date :"+date+"\nRuns on :"+start+"-"+end+"\n Resources :\n";
    for (int i =0; i< resources.length; i++)
    {
      temp+="\n";
      temp+= resources[i]+"\n";
    }
    return temp;
  }

}
