import com.sun.jdi.connect.IllegalConnectorArgumentsException;

public class Student
{
  private String name;
  private int grade;

  //This class on seperate class will work more sense.

  public class IllegalGradeException extends RuntimeException
  {
    public IllegalGradeException()
    {
      super("Invalid grade");
    }
  }

 // This above class.

  public Student(String name, int grade)
  {
    this.name = name;
    if (grade == -3 || grade == 0 || grade == 2 || grade == 4 || grade == 7
        || grade == 10 || grade == 12)
    {
      this.grade = grade;
    }
    else
    {
      throw new IllegalGradeException();
    }
  }

  public String getName()
  {
    return name;
  }

  public int getGrade()
  {
    return grade;
  }

  public void setGrade(int grade)
  {
    this.grade = grade;
  }
  public String toString()
  {
    return "Name :"+name+"\n Grade :"+grade;
  }
}
