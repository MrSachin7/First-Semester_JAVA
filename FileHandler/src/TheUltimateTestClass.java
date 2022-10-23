public class TheUltimateTestClass
{
  public static void main(String[] args)
  {
    Owner owner1 = new Owner("Sachin", "Baral");
    Owner owner2 = new Owner("Himal", "Sharma");

    Car car1 = new Car("015246BF", "Buggati", "FCAN", 2020, owner1);
    Car car2 = new Car("24342ADA", "Lamborginin", "DISAHDU", 2019, owner2);

    CarList cars = new CarList();
    cars.addCar(car1);
    cars.addCar(car2);

    CarModelManager carModelManager = new CarModelManager(
        "Filehandler/Test.bin");
    carModelManager.addCars(cars);

    System.out.println(carModelManager.getAllCars());
    System.out.println(cars.size());
  }
}
