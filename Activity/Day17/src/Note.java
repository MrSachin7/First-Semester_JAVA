public class Note
{
  private String message ;
  private boolean highPriority;
  public Note(String message)
  {
    this.message=message;
    highPriority=false;

  }

  public String getMessage()
  {
    return message;
  }

  public void setMessage(String message)
  {
    this.message = message;
  }
  public boolean isHighPriority()
  {
    return highPriority;
  }

  public void setHighPriority()
  {
    this.highPriority = true;
  }
  public void setLowPriority()
  {
    this.highPriority=false;
  }
  public Note copy()
  {
    Note temp =new Note(message);
    if (isHighPriority())
    {
      temp.setHighPriority();
    }
    return temp;
  }
  public String toString()
  {
    return "Message :"+message+"\n highPriority :"+highPriority;
  }
}
