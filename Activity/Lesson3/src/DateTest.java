public class DateTest
{
  public static void main(String[] args)
  {
    Date date = new Date();
    date.setDay(15);
    date.setMonth(2);
    date.setYear(2021);
    System.out.println(
        "The display date is " + date.getDay() + "/" + date.getMonth() + "/"
            + date.getYear());

    Date date2 = new Date();
    date.setDay(25);
    date.setMonth(9);
    date.setYear(2002);
    System.out.println(
        "The display date is " + date.getDay() + "/" + date.getMonth() + "/"
            + date.getYear());
    System.out.printf("%02d/%02d/%02d",date.getDay(),date.getMonth(),date.getYear());
  }

}
