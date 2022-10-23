//Implement the class GradeList shown in the class diagram below. The class represents a
//student’s list of (Danish) grades. Then implement a test program that creates a
//GradeList object, and tests its functionality. As it should be a list of Danish grades, then
//only use some of the following values when testing: -3, 0, 2, 4, 7, 10, or 12
//Afterwards add an equals method, public boolean equals(Object obj), that
//returns true if obj is a GradeList-object with identical values stored at all grades
//positions (use a loop). Otherwise the method should return false.

public class GradeList
{
  private Grade[] grades;

  public GradeList(int numberOfGrades)
  {
    {

      grades =new Grade[numberOfGrades];

    }
  }
  public int getNumberofGrades()
  {
    int count =0;
    for (int i =0; i<grades.length;i++)
    {

      if (grades[i] !=null)
      {
        count ++;
      }
    }
    return count;
  }
  public Grade getGrade(int index)
  {
    if (grades[index] !=null)
    {
      return grades[index];
    }
    else
    {
      System.out.println("Grade object is null" );
      return null;
    }
  }
  public void setGrade(Grade grades , int index)
  {
    this.grades[index]=grades;
  }
  public double getAverage()
  {
    int total=0;
    for (int i = 0; i<this.grades.length;i ++)
    {
      if(grades[i] !=null)
      {
        total += grades[i].getGrade();
      }
    }
    return (double)total/getNumberofGrades();
  }
  public String toString()
  {
    return "Number of grades ="+getNumberofGrades()+"\n Average ="+getAverage();
  }
}

