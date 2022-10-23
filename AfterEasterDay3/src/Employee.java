public class Employee extends Person
{
  private String organization;

  public Employee(String name, String addr, String organization)
  {
    super(name, addr);
    this.organization=organization;
  }

  public void setOrganization(String organization)
  {
    this.organization = organization;
  }

  public String getOrganization()
  {
    return organization;
  }
  public String toString()
  {
    return super.toString()+",Organization :"+organization;
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Employee))
    {
      return false;
    }

    Employee other = (Employee) obj;

    return super.equals(other) && organization.equals(other.organization);
  }
}
