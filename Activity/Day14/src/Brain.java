import java.util.Objects;

public class Brain
{
  private String activeMemoryItem;
  private String passiveMemoryItemOne;
  private String getPassiveMemoryItemTwo;

  public Brain()
  {
    activeMemoryItem = "";
    passiveMemoryItemOne = "";
    getPassiveMemoryItemTwo = "";
  }

  public int getIQ()
  {
    if (isBrainDamaged())
    {
      return 70;
    }
    int a = activeMemoryItem.length();
    int b = passiveMemoryItemOne.length();
    int c = getPassiveMemoryItemTwo.length();
    if ((a <= 10) || (b <= 10) || (c <= 10))
    {
      return 70;
    }
    else if (((a > 10) && (b > 10) && (c > 10)) && ((a > 20) || (b > 20) || (c
        > 20)))
    {
      return 130;
    }
    else
    {
      return 100;
    }
  }

  public boolean isBrainDamaged()
  {
    return (activeMemoryItem == (null) || passiveMemoryItemOne == (null)
        || getPassiveMemoryItemTwo == (null));
  }

  public void remember(String info)
  {
    getPassiveMemoryItemTwo = passiveMemoryItemOne;
    passiveMemoryItemOne = activeMemoryItem;
    activeMemoryItem = info;
  }

  public void refreshMemory(String info)
  {
    if (info.equals(passiveMemoryItemOne))
    {
      passiveMemoryItemOne = activeMemoryItem;
      activeMemoryItem = info;
    }
    else if (info.equals(getPassiveMemoryItemTwo))
    {
      getPassiveMemoryItemTwo = passiveMemoryItemOne;
      passiveMemoryItemOne = activeMemoryItem;
      activeMemoryItem = info;
    }

  }

  public boolean recall(String info)
  {
    return (info.equals(activeMemoryItem) || info.equals(passiveMemoryItemOne)
        || info.equals(getPassiveMemoryItemTwo));
  }

  public String recall()
  {
    return activeMemoryItem;
  }

  public String toString()
  {
    return "Active memory :" + activeMemoryItem + "\n Passive memory 1 :"
        + passiveMemoryItemOne + "\n Passive memory 2:"
        + getPassiveMemoryItemTwo;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Brain))
    {
      return false;
    }
    Brain other = (Brain) obj;
    return (other.activeMemoryItem.equals(activeMemoryItem)
        && other.passiveMemoryItemOne.equals(passiveMemoryItemOne)
        && other.getPassiveMemoryItemTwo.equals(getPassiveMemoryItemTwo));
  }

}
