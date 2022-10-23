public class Student
{
  private String name ;
  private int semester;

  public Student(String name , int semester)
  {
    this.name=name;
    this.semester=semester;
  }
  public String getName()
  {
    return name;
  }

  public int getSemester()
  {
    return semester;
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Student))
    {
      return  false;
    }
    Student temp = (Student)obj;
    return temp.semester==semester && temp.name==name;
  }
  public String toString()
  {
    return "Name :"+name+"\n Semester :"+semester;
  }
}

