public class RainFallTest
{
  public static void main(String[] args)
  {
    Rainfall rainfall1 =new Rainfall();
    rainfall1.setRainfall(1,2);
    rainfall1.setRainfall(2,21);
    rainfall1.setRainfall(3,20);
     System.out.println(rainfall1.averageMonthlyRainfall());
     System.out.println(rainfall1.leastRain());
     System.out.println(rainfall1.mostRain());
  }
}
