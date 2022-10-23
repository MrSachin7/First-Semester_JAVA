public class ServiceBookTest
{
  public static void main(String[] args)
  {
    Date date1 =new Date();
    Date date2 =new Date(2,5,2003);
    Service service1 = new Service(45,date1);
    Service service2= new Service(61,date2);
    ServiceBook serviceBook1 = new ServiceBook();
    serviceBook1.addService(service1);
    serviceBook1.addService(service2);
    ServiceBook serviceBook2 = new ServiceBook();
    serviceBook2.addService(service1);
    serviceBook2.addService(service2);
    System.out.println(serviceBook1.getNumberOfServices());
    int[] temp = serviceBook1.getAllServiceMilages();
    for (int i =0; i< temp.length;i++)
    {
      System.out.println(temp[i]);
    }
    Service[] temp2 = serviceBook1.getAllServices();
    for (int i =0; i< temp.length;i++)
    {
      System.out.println(temp2[i]);
    }
    System.out.println(serviceBook1.equals(serviceBook2));
    System.out.println(serviceBook1.getDateOfLastService());
    Date date3 = new Date(5,6,1232);
    System.out.println(serviceBook1.hasServiceOnDate(date1));
  }


}
