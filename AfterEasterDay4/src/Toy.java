public abstract class Toy
{
  private int suitableAge;

  public Toy(int suitableAge)
  {
    this.suitableAge=suitableAge;
  }

  public void setSuitableAge(int suitableAge)
  {
    this.suitableAge = suitableAge;
  }

  public int getSuitableAge()
  {
    return suitableAge;
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Toy))
    {
      return false;
    }
    Toy other = (Toy) obj;
    return other.suitableAge==suitableAge;
  }
  public String toString()
  {
    return "Suitable age :"+suitableAge;
  }
  public abstract String play();
}
