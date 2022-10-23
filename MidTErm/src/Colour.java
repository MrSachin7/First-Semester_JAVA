public class Colour
{
  private int red;
  private int green;
  private int blue;

  public Colour(int red, int green, int blue)
  {
    this.red = red;
    this.green = green;
    this.blue = blue;
  }

  public void setColour(int red, int green, int blue)
  {
    this.red = red;
    this.green = green;
    this.blue = blue;
  }

  public int getRed()
  {
    return red;
  }

  public int getGreen()
  {
    return green;
  }

  public int getBlue()
  {
    return blue;
  }

  public boolean isGray()
  {
    if (red == blue && red == green)
    {
      return true;
    }
    else
      return false;

  }

  public void mixWith(Colour colour2)
  {
    red = (int) ((0.5 * (red)) + (0.5 * (colour2.red)));
    green = (int) ((0.5 * (green)) + (0.5 * (colour2.green)));
    blue = (int) ((0.5 * (blue)) + (0.5 * (colour2.blue)));
  }

  public Colour copy()
  {
    return new Colour(red, green, blue);
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Colour))
    {
      return false;
    }
    Colour other = (Colour) obj;
    return other.red == red && other.blue == blue && other.green == green;
  }

  public String toString()
  {
  return "Red :"+red+"\n Blue: "+blue+"\nGreen :"+green;
  }
}
