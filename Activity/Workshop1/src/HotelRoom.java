public class HotelRoom
{
  private int roomNumber;
  private double rent;
  private Guest guest;

  public HotelRoom(int roomNumber, double rent)
  {
    this.roomNumber = roomNumber;
    this.rent = rent;
    guest = null;
  }

  public int getRoomNumber()
  {
    return roomNumber;
  }

  public double getRent()
  {
    return rent;
  }

  public Guest getGuest()
  {
    return guest;
  }

  public void setRent(double rent)
  {
    this.rent = rent;
  }

  public boolean isAvailable()
  {
    if (guest == null)
    {
      return true;
    }
    else
      return false;

  }

  public void checkIn(Guest guest)
  {
    if (isAvailable() == true)
    {
      this.guest = guest;
    }
  }

  public void checkOut()
  {
    guest = null;
  }

  public String toString()
  {
    if (isAvailable() == true)
    {
      return "Information for " + roomNumber + "\n Rent = " + rent + "\n it is "
          + isAvailable() + " that this room is available";
    }
    else
      return "Information for " + roomNumber + "\n Rent = " + rent + "\n it is "
          + isAvailable() + " that this room is available because " + guest.getName()
          + "is living here";
  }
}
