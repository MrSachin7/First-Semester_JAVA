import java.util.ArrayList;

public class Hotel
{
  private String name;
  private Room[] rooms;

  public Hotel(String name, Room[] rooms)
  {
    this.name = name;
    this.rooms = rooms;
  }

  public String getName()
  {
    return name;
  }

  public int getNumberOfRooms()
  {
    return rooms.length;
  }

  public int getNumberOfAvailableRooms()
  {
    int count = 0;
    for (int i = 0; i < rooms.length; i++)
    {
      if (rooms[i].isOccupied() == false)
      {
        count++;
      }

    }
    return count;
  }

  public Room getFirstAvailableRoom()
  {

    for (int i = 0; i < rooms.length; i++)
    {
      if (rooms[i].isOccupied() == false)
      {
        return rooms[i];
      }
    }
    return null;
  }
  public Room  getFirstAvailableRoom(double maxPrice)
  {


    for (int i =0; i<rooms.length; i++)
    {
      if (rooms[i].isOccupied()==false && rooms[i].getPrice()<=maxPrice)
      {
        return rooms[i];
      }
    }
    return null;
  }
  public Room[] getAllAvailableRooms(String bedType)
  {
    int count =0;
    String temp = bedType.toLowerCase();
    for (int i=0 ; i<rooms.length; i++)
    {
      if (rooms[i].isOccupied()==false && rooms[i].getBedType().equals(temp))
      {
        count++;
      }

    }
    int a=0;
    Room[] arraysRoom = new Room[count];
    for (int i=0; i<arraysRoom.length; i++)
    {
      if (rooms[i].isOccupied()==false && rooms[i].getBedType().equals(temp))
      {
        arraysRoom[a++]=rooms[i];
      }

    }
    return arraysRoom;
  }
  public boolean hasGuest(Guest guest)
  {
    for (int i=0; i<rooms.length; i++)
    {
      if (rooms[i].getGuest().equals(guest))
        return true;
    }
    return false;
  }
  public Room getRoom(Guest guest)
  {
    for (int i=0; i<rooms.length; i++)
    {
      if (rooms[i].getGuest().equals(guest))
       return rooms[i];
    }
    return null;
  }
}