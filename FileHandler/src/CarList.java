import java.io.Serializable;
import java.util.ArrayList;

public class CarList implements Serializable
{
  private ArrayList<Car> cars;

  public CarList()
  {
    cars = new ArrayList<Car>();
  }

  public int size()
  {
    return cars.size();
  }

  public int indexOfRegNumber(String regNumber)
  {
    int temp = -1;
    for (int i = 0; i < size(); i++)
    {
      if (cars.get(i).getRegNumber().equals(regNumber))
      {
        temp = i;
      }
    }
    return temp;
  }

  public Car getCar(int index)
  {
    return cars.get(index);
  }

  public Car getCar(String regNumber)
  {
    Car temp = null;
    for (int i = 0; i < size(); i++)
    {
      if (cars.get(i).getRegNumber().equals(regNumber))
      {
        temp = cars.get(i);
        break;
      }
    }
    return temp;
  }
  public void addCar(Car car)
  {
  if (indexOfRegNumber(car.getRegNumber())==-1)
  {
    cars.add(car);
  }
  }
  public String toString()
  {
    String temp ="";
    for (int i =0; i<size(); i++)
    {
      temp+=cars.get(i)+"\n";
    }
    return temp;
  }
}
