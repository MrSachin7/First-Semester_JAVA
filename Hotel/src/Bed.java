public class Bed
{
  private String type;

  public Bed(String type)
  {
    this.type = type;
  }
  public boolean isDouble()
  {
    String temp = type.toLowerCase();
    if (temp.equals(("double")))
    {
      return true;
    }
    else return false;
  }
  public boolean isKingSize()
  {
    String temp = type.toLowerCase();
    if (temp.equals(("kingsize")))
    {
      return true;
    }
    else return false;
  }
  public boolean isSingle()
  {
    String temp = type.toLowerCase();
    if (temp.equals(("single")))
    {
      return true;
    }
    else return false;
  }
}
