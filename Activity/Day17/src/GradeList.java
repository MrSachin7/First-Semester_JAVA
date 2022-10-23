import java.util.ArrayList;
public class GradeList
{
  private Grade grades;
  private ArrayList<Grade> list;
  public GradeList()
  {
    list =new ArrayList<Grade>();
  }
  public int getNumberOfGrades()
  {
    return list.size();
  }
  public ArrayList<Grade> getAllGrades()
  {
    return list;
  }
  public Grade[] getALlGradesAsArray()
  {

    Grade[] tempArray = new Grade[list.size()];
    Grade[] newArray = list.toArray(tempArray);
    return newArray;
  }
  public void addGrade(Grade grade)
  {
    list.add(grade);
  }
  public double getAverage()
  {
    int total =0;
    for (int i =0; i<list.size();i++)
    {
      total+=list.get(i).getGrade();

    }
    return (double)total/getNumberOfGrades();

  }
  public String toString()
  {
    return "no of grades :"+getNumberOfGrades()+"\n average : "+getAverage();
  }

}
