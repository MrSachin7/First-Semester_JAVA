public class PayRoll
{
  private String name;
  private double payRate;
  private double hours;
  private double grossPay;

  public PayRoll()
  {
    name = "Sachin";
    payRate = 180;
    hours = 40;
    grossPay = payRate * hours;
  }

  public PayRoll(String name, double payRate, double hours ,double grossPay)
  {
    this.name = name;
    this.payRate = payRate;
    this.hours = hours;
    this.grossPay =grossPay;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setPayRate(double payRate)
  {
    this.payRate = payRate;
  }

  public void setHours(double hours)
  {
    this.hours = hours;
  }

  public void setGrosspay(double grossPay)
  {
    this.grossPay = grossPay;
  }

  public String getName()
  {
    return name;
  }

  public double getPayRate()
  {
    return payRate;
  }

  public double getHours()
  {
    return hours;
  }

  public double getGrossPay()
  {
    return grossPay;
  }

  public String toString()
  {
    return "Name: " + name + "\n PayRate: " + payRate + "\n Hours: " + hours
        + "\n GrossPay :" + grossPay;
  }
}
