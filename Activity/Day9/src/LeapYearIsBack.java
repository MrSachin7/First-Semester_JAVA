public class LeapYearIsBack
{
  public static void main(String[] args)
  {
    Mydate date1 =new Mydate(1,1,2000);
    int counter=0;
    for( int i = 1582; i<= 2020; i++)
    {
      date1.setYear(i);
      if( date1.isLeapYear())
      {
        counter++;
        System.out.println(i +" is a leap year");
      }

    }
    System.out.println("The number of leap years is "+ counter);

  }
}
