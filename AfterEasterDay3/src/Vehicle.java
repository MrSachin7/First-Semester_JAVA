public class Vehicle
{
  private String owner;
  private double price;

  public Vehicle(String owner,Double price)
  {
    this.owner=owner;
    this.price=price;
  }

  public String getOwner()
  {
    return owner;
  }

  public void setOwner(String owner)
  {
    this.owner = owner;
  }

  public double getPrice()
  {
    return price;
  }
  public String toString()
  {
    return "Owner :"+owner+" ,Price :"+price;
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Vehicle))
    {
      return false;
    }
    Vehicle other=(Vehicle)obj;
    return other.price==price && other.owner.equals(owner);
  }
}
