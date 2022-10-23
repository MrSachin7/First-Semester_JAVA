public abstract  class Ball extends Toy
{
  private int diameter;
  public Ball(int suitableAge, int diameter)
  {
    super(suitableAge);
    this.diameter=diameter;
  }

  public void setDiameter(int diameter)
  {
    this.diameter = diameter;
  }

  public int getDiameter()
  {
    return diameter;
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Animal))
    {
      return false;
    }
    Ball other = (Ball) obj;
    return super.equals(other) && other.diameter==diameter;
  }

}
