public class Cat extends Pet
{
  private boolean isAHouseCat;

  public Cat(int age, String name, boolean isAHouseCat)
  {
    super(age, name);
    this.isAHouseCat=isAHouseCat;
  }

  public void setIsAHouseCat(boolean isAHouseCat)
  {
    this.isAHouseCat = isAHouseCat;
  }
  public boolean getIsAHouseCat()
  {
    return isAHouseCat;
  }
  public String speak()
  {
    return "Meow";
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Cat))
    {
      return false;
    }
    Cat other = (Cat) obj;
    return super.equals(other) && other.isAHouseCat==isAHouseCat;
  }
}
