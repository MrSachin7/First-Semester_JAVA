public class Service
{
  private int mileage;
  private Date date;

  public Service (int mileage , Date date)
  {
    this.mileage=mileage;
    this.date=date;
  }
  public int getMileage()
  {
    return mileage;
  }

  public Date getDate()
  {
    return date.copy();
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Service))
    {
      return false;
    }
    Service other=(Service)obj;
    return other.date.equals(date) && other.mileage==mileage;
  }
  public String toString()
  {
    return " Date :"+date+"\nMileage :"+mileage;

  }
}
