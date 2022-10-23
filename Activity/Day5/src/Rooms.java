//Design classes for a reservation system.
//A reservation system allows a faculty member to reserve rooms. When a faculty member
//comes to the administrator to reserve a room in a given time period, he is shown a list of
//all rooms with their block and floor number, the number of seats, and whether the room
//has a projector. The faculty member chooses a room, and the administrator fills out a
//reservation receipt with the room number, the name of the faculty member, and the time
//period.
//a) Find the nouns in the above description that you could use as a class or
//attribute name.
//b) Find the classes and attributes among the nouns.
//c) Design your classes and draw a UML class diagram with them.

public class Rooms
{
  private int block;
  private int floor ;
  private int seats;
  private String projector;

  public  Rooms()
  {

  }
}
