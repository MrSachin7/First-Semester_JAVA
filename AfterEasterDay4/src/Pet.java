public abstract class Pet extends Animal
{
  private String name;

  public Pet(int age , String name)
  {
    super(age);
    this.name=name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getName()
  {
    return name;
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Pet))
    {
      return false;
    }
    Pet other = (Pet)obj;
    return super.equals(other) && other.name.equals(name);
  }
  public String toString()
  {
    return super.toString()+" Name :"+name;
  }
}
