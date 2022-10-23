public class Lego extends Toy
{
  private int numberOfBricks;
  public Lego(int suitableAge,int numberOfBricks)
  {
    super(suitableAge);
    this.numberOfBricks=numberOfBricks;
  }

  public void setNumberOfBricks(int numberOfBricks)
  {
    this.numberOfBricks = numberOfBricks;
  }

  public int getNumberOfBricks()
  {
    return numberOfBricks;
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Lego))
    {
      return false;
    }
    Lego other = (Lego)obj;
    return super.equals(other) && other.numberOfBricks==numberOfBricks;
  }
  public String play()
  {
    return "Build";
  }

}
