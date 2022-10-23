public class Clocktest
{
  public static void main(String[] args)
  {
    Clock clock1 =new Clock(20, 52,59);
    Clock clock2 = new Clock(3600);
    System.out.println(clock2);
    clock1.setTimeFormat24(15);
    System.out.println(clock1.convertToSecond());
    System.out.println(clock1.timeInSecondsTo(clock2));
    System.out.println(clock1.isBefore(clock2));
    System.out.println(clock1.timeTo(clock2));
    System.out.println(clock1);




  }
}
