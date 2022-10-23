import java.sql.DatabaseMetaData;

public class MyDateTest
{
  public static void main(String[] args)
  {

    MyDate date2 = new MyDate(10,5,1996);
    System.out.println(date2.dayOfWeek());
    System.out.println(date2.getAstro());

  }
}
