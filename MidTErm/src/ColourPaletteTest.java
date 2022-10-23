public class ColourPaletteTest
{
  public static void main(String[] args)
  {
    Colour colour1 = new Colour(1,2,3);
    Colour colour2 =new Colour(5,5,5);
    ColourPalette colourPalette1=new ColourPalette(3);
    colourPalette1.add(colour1);
    colourPalette1.add(colour2);
    System.out.println(colourPalette1.getNumberOfColours());
    System.out.println(colourPalette1.get(1));
    colourPalette1.mixColour(1, colour1);
    System.out.println(colourPalette1.get(1));



  }
}
