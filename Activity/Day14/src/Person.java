public class Person

{
  private String name;
  private String address;
  private MyDate birthday;
  private Brain brain;

  public Person(String name, String address, MyDate birthday)
  {
    this.name = name;
    this.address = address;
    this.birthday = birthday.copy();
    brain =new Brain();
  }

  public Person(String name, MyDate birthday)
  {
    this.name = name;
    this.birthday = birthday.copy();
    address="";
    brain =new Brain();
  }

  public Person(MyDate birthday)
  {
    this.birthday = birthday.copy();
    name="";
    address="";
    brain =new Brain();
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

  public MyDate getBirthday()
  {
    return birthday;
  }

  public int getAge()
  {

    MyDate today = MyDate.today();
    int a = (today.getYear()- (birthday.getYear()));
    if (today.getMonth() >birthday.getMonth() || (today.getMonth()==birthday.getMonth() && today.getDay()>birthday.getDay()))
    {
      return a;
    }
    else return a-1;
  }
  public int getIQ()
  {
    return brain.getIQ();
  }
  public boolean isBrainDamaged()
  {
    return brain.isBrainDamaged();
  }
  public boolean doYouRemember(String topic)
  {
    return brain.recall(topic);
  }
  public void rememberThis(String topic)
  {
    if (brain.recall(topic)==true)
    {
      brain.refreshMemory(topic);

    }
    else
    {
      brain.remember(topic);
    }

  }
  public String whatAreYouThinkingAbout()
  {
    return brain.recall();
  }

  public String toString()
  {
    return "Name :"+name+"\nAddress :"+address+"Birthday :"+birthday;
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Person))
    {
      return false;
    }
    Person other = (Person)obj;
    return (other.name.equals(name) && other.birthday.equals(birthday) &&other.address.equals(address));
  }
}





