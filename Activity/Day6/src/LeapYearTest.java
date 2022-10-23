public class LeapYearTest
{
  public static void main(String[] args)
  {
    Mydate date1 = new Mydate();
    date1.setDay(15);
    date1.setMonth(2);
    date1.setYear(2021);
    System.out.println(
        "The display date is " + date1.getDay() + "/" + date1.getMonth() + "/"
            + date1.getYear());

    date1.isLeapYear();
    System.out.println("It is "+date1.isLeapYear() + " that the given year is leap year.");

  }
}
