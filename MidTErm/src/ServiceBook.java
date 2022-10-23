import java.util.ArrayList;
public class ServiceBook
{
  private ArrayList<Service> services;
  public ServiceBook()
  {
    services=new ArrayList<Service>();
  }
  public void addService(Service service)
  {
    services.add(service);
  }
  public int getNumberOfServices()
  {
    return services.size();
  }
  public Service getService(int index)
  {
    return services.get(index);
  }
  public Service[] getAllServices()
  {
    Service[] temp = new Service[services.size()];
    Service[] newArray=services.toArray(temp);
    return newArray;
  }
  public int[] getAllServiceMilages()
  {
    int[] tempArray=new int[services.size()];
    for (int i =0; i<services.size();i++)
    {
      tempArray[i] = services.get(i).getMileage();
    }
    return tempArray;
  }
  public boolean hasServiceOnDate(Date date)
  {
    boolean a =false;
    for (int i =0;i<services.size();i++)
    {
      if (services.get(i).getDate().equals(date))
      {
        a= true;
      }
    }
    return a;
  }
  public  Date getDateOfLastService()
  {
    return services.get(services.size()-1).getDate();
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof ServiceBook))
    {
      return false;
    }
    ServiceBook other = (ServiceBook)obj;
    return (other.services.equals(services));
  }
  public String toString()
  {
    return "Services :"+services;
  }

}
