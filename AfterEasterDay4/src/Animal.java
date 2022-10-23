public abstract class Animal
{
  private int age;
  public Animal(int age)
  {
    this.age =age;
  }

  public void setAge(int age)
  {
    this.age = age;
  }

  public int getAge()
  {
    return age;
  }
  public String toString()
  {
    return "Age :"+age;
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Animal))
    {
      return false;
    }
    Animal other = (Animal)obj;
    return other.age==age;
  }

  public abstract String speak();
}
