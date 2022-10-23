import java.io.FileNotFoundException;
import java.io.IOException;

public class CarModelManager
{
  private String fileName;

  public CarModelManager(String fileName)
  {
    this.fileName=fileName;
  }
  public CarList getAllCars()
  {
    CarList cars = new CarList();
    try
    {
      cars = (CarList)MyFileHandler.readFromBinaryFile(fileName);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO error reading file");
    }
    catch (ClassNotFoundException e)
    {
      System.out.println("Class not found");
    }
    return cars;
  }
  public void addCar(Car car)
  {
    try
    {
      MyFileHandler.writeToBinaryFile(fileName, car);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not Found");
    }
    catch (IOException e)
    {
      System.out.println("IO error reading file");
    }
  }
  public void addCars(CarList cars)
  {
    try
    {
      MyFileHandler.writeToBinaryFile(fileName,cars);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO error reading file");
    }
  }
  public void deleteCar(Car car)
  {
    CarList allCars = getAllCars();
    CarList emptyList = new CarList();
    for (int i =0; i<allCars.size(); i++)
    {
      if (!(allCars.getCar(i).equals(car)))
      {
        emptyList.addCar(allCars.getCar(i));
      }
    }
    addCars(emptyList);
  }
  public void deleteCarByRegNumber(String regNumber)
  {
    CarList allCars = getAllCars();
    CarList temp = new CarList();
    for (int i =0; i<allCars.size(); i++)
    {
      if (!allCars.getCar(i).getRegNumber().equals(regNumber))
      {
        temp.addCar(allCars.getCar(i));
      }
    }
    addCars(temp);
  }
}
