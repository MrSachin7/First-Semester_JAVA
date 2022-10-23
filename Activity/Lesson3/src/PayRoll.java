public class PayRoll
{
  private String name;
  private double payRate;
  private double hours;
  private double grossPay;

  public void setName(String n)
  {
    name = n;
  }

  public void setPayRate(double pR)
  {
    payRate = pR;
  }

  public void setHours(double h)
  {
    hours = h;
  }

  public void setGrosspay(double gP)
  {
    grossPay = gP;
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

}
