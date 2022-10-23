import java.util.ArrayList;

public class Course
{
  private String title;
  private Instructor[] instructor;
  private ArrayList < Student >student;
  public Course(String title , Instructor primaryInstructor)
  {
    this.title=title;
    student =new ArrayList<>();
    instructor=new Instructor[2];
    instructor[0]=primaryInstructor;
  }

  public String getTitle()
  {
    return title;
  }
  public Instructor getPrimaryInstructor()
  {
    return instructor[0];
  }
  public Instructor getSecondaryInstructor()
  {
    return instructor[1];
  }
  public  void setSecondaryInstructors(Instructor instructor)
  {
    this.instructor[1]=instructor;
  }
  public void addStudent(Student student)
  {
    this.student.add(student);
  }
  public int getNumberOfInstructors()
  {
    int count =0;
    for (int i=0 ; i<instructor.length; i++)
    {
      if (instructor[i]!=null)
      {
        count++;
      }
    }
    return count;
  }
  public int getNumberOfStudents(int semester)
  {
    int count=0;
    for (int i=0; i< student.size(); i++)
    {
      if (student.get(i).getSemester()==semester)
      {
        count++;
      }
    }
    return count;
  }
  public Student[] getStudentsBySemester(int semester)
  {
    Student[] temp = new Student[getNumberOfStudents(semester)];
    for (int i =0; i< temp.length; i++)
    {
      if (student.get(i).getSemester()==semester)
        temp[i]= student.get(i);
    }
    return temp;
  }
  public boolean hasStudent(String name)
  {

    for (int i =0; i<student.size();i++)
    {
      if (student.get(i).getName().equals(name))
      {
        return true;
      }
    }
    return false;
  }
  public String toString()
  {
    return "title :"+title+"\n Number of Instructors :"+getNumberOfInstructors()+"\n Number of Instructors : "+getNumberOfInstructors();
  }

}
