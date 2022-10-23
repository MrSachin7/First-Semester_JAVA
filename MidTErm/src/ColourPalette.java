import java.util.ArrayList;
public class ColourPalette
{
  private int numberOfColours;
  private ArrayList<Colour> colour;
  public ColourPalette(int maxNumberOfColors)
  {
    colour=new ArrayList<>(maxNumberOfColors);
    numberOfColours=maxNumberOfColors;
  }

  public int getNumberOfColours()
  {
    return colour.size();
  }
  public void add(Colour colour)
  {
    if (getNumberOfColours()< numberOfColours)
    {
      this.colour.add(colour);
    }
  }
  public Colour get(int index)
  {
    if (index<getNumberOfColours())
    {
      return colour.get(index);
    }
    else
    {
      System.out.println("There is not the index you provided");
      return null;
    }
  }
  public int getNumberOfGrayColours()
  {
    int count =0;
    for (int i =0; i<colour.size();i++)
    {
      if (colour.get(i).isGray())
      {
        count++;
      }
    }
    return count;
  }
  public void mixColour(int index, Colour colour2)
  {
    colour.get(index).mixWith(colour2);
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof ColourPalette))
    {
      return false;
    }
    ColourPalette other = (ColourPalette) obj;
    return (other.colour.equals(colour));
  }
  public String toString()
  {
    return "Colour :"+colour;
  }
}

