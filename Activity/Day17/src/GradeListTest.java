public class GradeListTest
{
  public static void main(String[] args)
  {
    Grade grade1 = new Grade("SDJ", 13);
    Grade grade2 =new Grade("SSE",7);
    GradeList gradeList1 = new GradeList();
    gradeList1.addGrade(grade1);
    gradeList1.addGrade(grade2);

    System.out.println(gradeList1.getAverage());
    System.out.println(gradeList1.getAllGrades());
  }

}