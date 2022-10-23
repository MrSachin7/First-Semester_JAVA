public class Person
{
  private String name;
  private String address;

  public Person(String name, String addr)
  {
    this.name = name;
    address = addr;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getAddress()
  {
    return address;
  }

  public void setAddress(String address)
  {
    this.address = address;
  }

  public String toString()
  {
    return "Name: " + name + ", Address: " + address;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Person))
    {
      return false;
    }

    Person other = (Person) obj;

    return name.equals(other.name) && address.equals(other.address);
  }
}