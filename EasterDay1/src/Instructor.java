public class Instructor
{
  private String name;
  private int officeNumber;

  public Instructor(String name , int officeNumber)
  {
    this.name=name;
    this.officeNumber=officeNumber;

  }

  public String getName()
  {
    return name;
  }

  public int getOfficeNumber()
  {
    return officeNumber;
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Object))
    {
      return false;
    }
    Instructor temp = (Instructor)obj;
    return temp.name==name && temp.officeNumber==officeNumber;
  }
  public String toString()
  {
    return "Name :"+name+"\n OfficeNumber : "+officeNumber;
  }
}

