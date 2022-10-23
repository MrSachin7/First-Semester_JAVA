//Implement a class Car holding information of a car. The class should have:
//a) 5 instance variables: make, model, color, licenseNumber (all of type String) and
//year (of type int).
//b) A 5-argument constructor setting all instance variables to values passed as arguments.
//c) A 4-argument constructor with make, model, color, and year as arguments. The instance
//variable licenseNumber should be set to some value indicating that the car has no licence
//number.
//d) Get-methods for all instance variables.
//e) Set methods for color and licenseNumber.
//f) A method called copy that returns a reference to a Car-object with the same values for the 5
//instance variables.
//g) A toString method returning all information in a string.
//h) An equals method returning true if the object passed as argument is a car with the same
//values of all 5 instance variables.

public class Car
{
  private String make;
  private String model;
  private String color;
  private String licenseNumber;
  private int year;

  public Car(String make, String model, String color, String licenseNumber,
      int year)
  {
    this.make = make;
    this.model = model;
    this.color = color;
    this.licenseNumber = licenseNumber;
    this.year = year;
  }

  public Car(String make, String model, String color, int year)
  {
    this.make = make;
    this.model = model;
    this.color = color;
    this.year = year;
    licenseNumber = "No license number";
  }

  public String getMake()
  {
    return make;
  }

  public int getYear()
  {
    return year;
  }

  public String getColor()
  {
    return color;
  }

  public String getLicenseNumber()
  {
    return licenseNumber;
  }

  public String getModel()
  {
    return model;
  }

  public void setColor(String color)
  {
    this.color = color;
  }

  public void setLicenseNumber(String licenseNumber)
  {
    this.licenseNumber = licenseNumber;
  }

  public Car copy()
  {
    return new Car(make, model, color, licenseNumber, year);
  }

  public String toString()
  {
    return "Make : " + make + "\n Model :" + model + "\n Color: " + color
        + "\n License Number : " + licenseNumber + "Year :" + year;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Car))
    {
      return false;
    }
    Car other = (Car) obj;
    return other.make == make && other.model == model && other.color == color
        && other.licenseNumber == licenseNumber && other.year == year;
  }
}
