public abstract class OnlineLesson extends Lesson
{
  private boolean cameraRequired;

  public OnlineLesson(String topic, Date date , Time start, Time end , Resource[] res,boolean camera)
  {
    super(topic, date, start, end, res);
    cameraRequired=camera;
  }
  public boolean isCameraRequired()
  {
    return cameraRequired;
  }
  public abstract String nameOfSoftware();

  public boolean equals(Object obj)
  {
    if (!(obj instanceof OnlineLesson))
    {
      return false;
    }
    else
    {
      OnlineLesson other = (OnlineLesson)obj;
      return super.equals(other) && other.cameraRequired==cameraRequired;
    }
  }
  public String toString()
  {
    return super.toString() +"\n Camera Required :"+cameraRequired;
  }

}
