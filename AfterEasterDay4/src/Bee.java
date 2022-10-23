public class Bee extends Animal
{
  private boolean isAHoneyBee;

  public Bee(int age, boolean isAHoneyBee)
  {
    super(age);
    this.isAHoneyBee=isAHoneyBee;
  }

  public void setAHoneyBee(boolean AHoneyBee)
  {
    isAHoneyBee = AHoneyBee;
  }
  public boolean getAHoneyBee()
  {
    return isAHoneyBee;
  }
  public String speak()
  {
    return "Bzzz";
  }
  public String toString()
  {
    return super.toString()+"It is "+isAHoneyBee+" that is a honeybee";
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Bee))
    {
      return false;
    }
    Bee other = (Bee)obj;
    return super.equals(other) && other.isAHoneyBee==(isAHoneyBee);
  }
}
