public class Person

{
  private String name;
  private String birthday;

  public Person()
  {
    name = "Sachin Baral";
    birthday = "25 SEP 2002";
  }

  public Person(String name, String birthday)
  {
    this.name = name;
    this.birthday = birthday;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setBirthday(String birthday)
  {
    this.birthday = birthday;
  }

  public String getName()
  {
    return name;
  }

  public String getBirthday()

  {
    return birthday;
  }
  public String toString()
  {
    return "Name :"+name + "\nBirthday :" +birthday;
  }

}
