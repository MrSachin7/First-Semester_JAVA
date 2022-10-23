import java.util.ArrayList;

public class Course
{
  private String name;
  private ArrayList<Lesson> schedule;

  public Course(String name)
  {
    this.name = name;
    schedule = new ArrayList<>();
  }

  public String getName()
  {
    return name;
  }

  public int getNumberOfLessons()
  {
    return schedule.size();
  }

  public void addLesson(Lesson lesson)
  {
    schedule.add(lesson);
  }

  public void removeLesson(Lesson lesson)
  {
    for (int i = 0; i < schedule.size(); i++)
    {
      if (schedule.get(i).equals(lesson))
      {
        schedule.remove(lesson);
      }
    }
  }

  public boolean hasLessonOnDate(Date date)
  {
    boolean temp = false;
    for (int i = 0; i < schedule.size(); i++)
    {
      if (schedule.get(i).getDate().equals(date))
      {
        temp = true;
        break;
      }
    }
    return temp;
  }

  public ArrayList<Lesson> getAllLessons()
  {
    return schedule;
  }

  public ArrayList<String> getAllTopics()
  {
    ArrayList<String> temp = new ArrayList<>();
    for (int i = 0; i < schedule.size(); i++)
    {
      temp.add(schedule.get(i).getTopic());
    }
    return temp;
  }

  public ArrayList<OnlineLesson> getOnlineLessons()
  {
    ArrayList<OnlineLesson> temp = new ArrayList<>();
    for (int i = 0; i < schedule.size(); i++)
    {
      if (schedule.get(i) instanceof OnlineLesson)
      {
        temp.add((OnlineLesson) schedule.get(i));
      }
    }
    return temp;
  }

  public ArrayList<OnlineLesson> getOnlineLessonsWithCameraRequired()
  {
    ArrayList<OnlineLesson> temp = new ArrayList<>();
    for (int i = 0; i < getOnlineLessons().size(); i++)
    {
      if (getOnlineLessons().get(i).isCameraRequired())
      {
        temp.add(getOnlineLessons().get(i));
      }
    }
    return temp;
  }

  public ArrayList<DiscordLesson> getDiscordLessons()
  {
    ArrayList<DiscordLesson> temp = new ArrayList<>();
    for (int i = 0; i < getOnlineLessons().size(); i++)
    {
      if (getOnlineLessons().get(i) instanceof DiscordLesson)
      {
        temp.add((DiscordLesson) getOnlineLessons().get(i));
      }
    } return temp;
  }

  public ArrayList<ZoomLesson> getZoomLessonsWithBreakoutRooms()
  {
    ArrayList<ZoomLesson> temp = new ArrayList<>();
    for (int i = 0; i < getOnlineLessons().size(); i++)
    {
      if (getOnlineLessons().get(i) instanceof ZoomLesson)
      {
        if (((ZoomLesson) getOnlineLessons().get(i)).usesBreakoutRooms())
        {
          temp.add((ZoomLesson) getOnlineLessons().get(i));
        }
      }
    }
    return temp;
  }
  public ArrayList<Resource> getAllResource()
  {
    ArrayList<Resource> temp = new ArrayList<>();
    for (int i = 0; i < schedule.size(); i++)
    {
      for (int j = 0; j < schedule.get(i).getResources().length; j++)
      {
        temp.add(schedule.get(i).getResources()[j]);
      }
    }
      return temp;

  }
  public String toString()
  {
    String temp = "Name :"+name+"Lessons:\n";
    for (int i=0;i<schedule.size();i++)
    {
      temp+="\n";
      temp+=schedule.get(i)+"";

    }
    return temp;
  }
}
