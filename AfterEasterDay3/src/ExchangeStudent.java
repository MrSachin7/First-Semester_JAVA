public class ExchangeStudent extends Student
{
  private int intProjectGroup;

  public ExchangeStudent(String name, String addr, int studentNo, int group)
  {
    super(name, addr, studentNo);
    intProjectGroup = group;
  }

  public int getProjectGroup()
  {
    return intProjectGroup;
  }

  public void setProjectGroup(int group)
  {
    intProjectGroup = group;
  }

  public String toString()
  {
    return super.toString() + ", GroupNo: " + intProjectGroup;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof ExchangeStudent))
    {
      return false;
    }

    ExchangeStudent other = (ExchangeStudent) obj;
    return super.equals(other) && intProjectGroup == other.intProjectGroup;
  }
}