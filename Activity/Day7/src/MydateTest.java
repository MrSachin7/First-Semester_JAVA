public class MydateTest
{
  public static void main(String[] args)
  {
    Mydate date1 =new Mydate( 25 ,9, 2002);
    System.out.println(date1.daysInMonth());
    System.out.println(date1.getAstro());
    System.out.println(date1.dayOfWeek());

  }
}
