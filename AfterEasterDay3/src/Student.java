import java.util.ArrayList;

public class Student extends Person
{
  private int studentNo;
  private ArrayList<String> grades;

  public Student(String name, String addr, int studentNo)
  {
    super(name, addr);
    this.studentNo = studentNo;
    grades = new ArrayList<String>();
  }

  public int getStudentNo()
  {
    return studentNo;
  }

  public void setStudentNo(int studentNo)
  {
    this.studentNo = studentNo;
  }

  public void addGrade(String grade)
  {
    grades.add(grade);
  }

  public String getGrade(int index)
  {
    return grades.get(index);
  }

  public String[] getAllGrades()
  {
    String[] tempArray = new String[grades.size()];
    return grades.toArray(tempArray);
  }

  public String toString()
  {
    return super.toString() + ", StudentNo: " + studentNo + ", Grades :" + grades;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Student))
    {
      return false;
    }

    Student other = (Student) obj;

    return super.equals(other) && studentNo == other.studentNo
        && grades.equals(other.grades);
  }
}