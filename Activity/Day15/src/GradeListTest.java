public class GradeListTest
{
  public static void main(String[] args)
  {
    GradeList sachin =new GradeList(5);
    sachin.setGrade(12,0);
    sachin.setGrade(-3,1);
    sachin.setGrade(7,3);
    sachin.setGrade(10,2);
    System.out.println(sachin);
  }
}
