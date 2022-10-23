public class GradeTest
{
  public static void main(String[] args)
  {
    Grade grade1 =new Grade("SDJ",10);
    Grade grade2 =new Grade("SSE",5);
    GradeList gradeList1 =new GradeList(5);
    gradeList1.setGrade(grade1 ,0);
    gradeList1.setGrade(grade2,1);
    System.out.println(gradeList1.getNumberofGrades());
    System.out.println(gradeList1.getAverage());
    System.out.println(gradeList1);

  }
}
