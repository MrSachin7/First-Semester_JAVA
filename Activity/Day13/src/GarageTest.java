public class GarageTest
{
  public static void main(String[] args)
  {
    Garage garage1=new Garage();
    System.out.println(garage1);

    System.out.println(garage1);
    Car car1 = new Car("saasa","lamborghini","asfdas","423565Ads",2002);
    garage1.park(car1 , 2);
    System.out.println(garage1);
    garage1.leaveGarage(2);
    System.out.println(garage1);
  }
}
