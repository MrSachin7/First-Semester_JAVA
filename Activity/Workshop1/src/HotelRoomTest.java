public class HotelRoomTest
{
  public static void main(String[] args)
  {
    HotelRoom hotelRoom1 = new HotelRoom(11, 3500);
    HotelRoom hotelRoom2 = new HotelRoom(12, 3580);
    HotelRoom hotelRoom3=new HotelRoom(13 , 2500);

    hotelRoom1.setRent(3600);

    Guest guest1 = new Guest("Sachin Baral");
    Guest guest2 = new Guest( "Himal Sharma");
    hotelRoom1.checkIn(guest1);
    hotelRoom2.checkIn(guest2);
    System.out.println(hotelRoom1);
    System.out.println(hotelRoom2);
    System.out.println(hotelRoom3);

  }
}
