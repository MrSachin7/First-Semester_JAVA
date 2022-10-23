public class Teacher extends Employee
{
  private double payRate;
  private double hours;

  public Teacher(String name, String addr, String organization, double rate, double hours)
  {
    super(name, addr,organization);
    payRate = rate;
    this.hours = hours;
  }

  public double getpayRate()
  {
    return payRate;
  }

  public void setPayRate(double payRate)
  {
    this.payRate = payRate;
  }

  public double getHours()
  {
    return hours;
  }

  public void setHours(double hours)
  {
    this.hours = hours;
  }

  public double getSalary()
  {
    return payRate * hours;
  }

  public String toString()
  {
    return super.toString() + ", PayRate: " + payRate + ", Hours :" + hours;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Teacher))
    {
      return false;
    }

    Teacher other = (Teacher) obj;

    return super.equals(other) && payRate == other.payRate
        && hours == other.hours;
  }
}