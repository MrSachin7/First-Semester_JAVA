import java.security.PublicKey;
import java.util.ArrayList;

public class Student
{
  private int studentNumber;
  private String name;
  private CoronaPassport coronaPassport;
  private ArrayList<Course> courses;
  private ArrayList<Grade> grades;

  public Student(int studentNumber, String name)
  {
    this.studentNumber = studentNumber;
    this.name = name;
    courses = new ArrayList<Course>();
    grades = new ArrayList<Grade>();
    coronaPassport = null;
  }

  public int getStudentNumber()
  {
    return studentNumber;
  }

  public String getName()
  {
    return name;
  }

  public void addCourse(Course course)
  {
    courses.add(course);
  }

  public void addGrade(int grade, Course course)
  {
    for (int i = 0; i < courses.size(); i++)
    {
      if (courses.get(i).equals(course))
      {
        grades.add(new Grade(grade, course));
      }
    }
  }

  public void addCoronaPassport(CoronaPassport passport)
  {
    coronaPassport = passport;
  }

  public void removeCoronaPassport()
  {
    coronaPassport = null;
  }

  public CoronaPassport getCoronaPassport()
  {
    return coronaPassport;
  }

  public boolean hasValidCoronaPassport()
  {
    boolean temp = false;
    if (coronaPassport == null)
    {
      return false;
    }

    if (coronaPassport.getDate().isBefore(Date.today()))
    {
      if (coronaPassport.getReason().toUpperCase().equals("VACCINATED"))
      {
        temp = true;
      }
      if (coronaPassport.getReason().toUpperCase().equals("TESTED")
          && coronaPassport.getDate().numberOfDaysUntil(Date.today()) <= 3)
      {
        temp = true;
      }
      if (coronaPassport.getReason().toUpperCase().equals("INFECTED"))
      {
        if (coronaPassport.getDate().numberOfDaysUntil(Date.today()) > 14)
        {
          if (coronaPassport.getDate().numberOfDaysUntil(Date.today()) <= 180)
          {
            temp = true;
          }
        }
      }
    }
    return temp;
  }

  public double getGradeAverage()
  {
    int totalGrade = 0;
    int totalNumberOfGrades = grades.size();
    for (int i = 0; i < grades.size(); i++)
    {
      totalGrade += grades.get(i).getGrade();
    }
    return totalGrade / totalNumberOfGrades;
  }

  public Grade[] getALlGrades()
  {
    return grades.toArray(new Grade[(grades.size())]);
  }

  public Course[] getALlCourses()
  {
    return courses.toArray(new Course[(courses.size())]);
  }
}
