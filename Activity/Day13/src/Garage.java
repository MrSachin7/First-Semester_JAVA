public class Garage
{
  private Car position1;
  private Car position2;

  public Garage()
  {
    position1 = null;
    position2 = null;
  }

  public boolean isParkingAreaTaken(int position)
  {
    if (position == 1)
    {
      return position1 != null;
    }
    else if (position == 2)
    {
      return position2 != null;
    }
    else
    {
      return false;
    }
  }

  public void park(Car car, int position)
  {
    if (position == 1 && position1 == null)
    {
      position1 = car;
    }
    if (position == 2 && position2 == null)
    {
      position2 = car;
    }
  }

  public Car leaveGarage(int position)
  {
    if (position == 1)
    {
      Car a = position1;
      if (position1 == null)
      {
        return null;
      }
      else
      {
        position1 = null;

      }
      return a;

    }
    else if (position == 2)
    {
      Car b = position2;
      if (position2 == null)
      {
        return null;
      }
      else
      {
        position2 = null;
      }
      return b;
    }
    else
      return null;
  }

  public String toString()
  {
    if (position1 == null && position2 == null)
    {
      return "The 1st and 2nd  place is empty";
    }
    else if (position1 == null)
    {
      return "The 1st position is empty and the 2nd position is already parked";
    }
    else if (position2 == null)
    {
      return "The 2nd position is empty and the 1st position is already parked";
    }
    else
    {
      return "Both positions are already parked";
    }
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Garage))
    {
      return false;
    }
    Garage other = (Garage) obj;

    return (position1.equals(other.position1) && position2
        .equals(other.position2));

  }
}
