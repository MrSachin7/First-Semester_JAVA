import java.io.Serializable;

public class Car implements Serializable
{
  private String regNumber;
  private String make;
  private String model;
  private int year;
  private Owner owner;

  public Car(String regNumber, String make, String model, int year, Owner owner)
  {
    this.regNumber=regNumber;
    this.make=make;
    this.model=model;
    this.year=year;
    this.owner=owner;
  }

  public int getYear()
  {
    return year;
  }

  public String getModel()
  {
    return model;
  }

  public Owner getOwner()
  {
    return owner;
  }

  public String getMake()
  {
    return make;
  }

  public String getRegNumber()
  {
    return regNumber;
  }
  public String toString()
  {
    return regNumber+", "+make+", "+model+", "+year+","+owner;
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof  Car))
    {
      return false;
    }
    Car temp = (Car)obj;
    return temp.owner.equals(owner) && temp.year==year && temp.model.equals(model) && temp.make.equals(make) && temp.regNumber.equals(regNumber);
  }
}
