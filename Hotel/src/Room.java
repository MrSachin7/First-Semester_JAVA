import java.util.Random;

public class Room
{
  private int number;
  private Guest guest;
  private Bed bed;

  public Room(int number, String bedType)
  {
    this.number = number;
    bed = new Bed(bedType);
  }

  public int getNumber()
  {
    return number;
  }

  public int getFloor()
  {
    return number / 100;
  }

  public double getPrice()
  {
    if (bed.isSingle())
    {
      return 59.50;
    }
    else if (bed.isDouble())
    {
      return 72.40;
    }
    else
      return 89.00;
  }

  public boolean isOccupied()
  {
    if (guest == null)
    {
      return false;
    }
    else
      return true;
  }

  public void registerGuest(Guest guest)
  {
    this.guest = guest;
  }

  public void vacate()
  {
    if (isOccupied() == true)
    {
      guest = null;
    }
  }

  public String getBedType()
  {
    if (bed.isDouble())
      return "double";
    if (bed.isSingle())
      return "single";
    if (bed.isKingSize())
      return "kingsize";
    else
      return "The input is invalid";
  }

  public Guest getGuest()
  {
    return guest;
  }
}
