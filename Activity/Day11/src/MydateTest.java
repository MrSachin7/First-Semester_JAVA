public class MydateTest
{
  public static void main(String[] args)
  {
    Mydate date1 = new Mydate(4,5,6);
    Mydate date2 = new Mydate(4,6,6);
    date2.setMonth(5);
    if (date1.equals(date2))
    {
      System.out.println("Both date are same");
    }
    else
    {
      System.out.println("The date are different");
    }
  }
}
