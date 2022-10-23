public class Dog extends Pet
{
  private String breed;

  public Dog(int age , String name, String breed )
  {
    super(age, name);
    this.breed=breed;
  }

  public void setBreed(String breed)
  {
    this.breed = breed;
  }

  public String getBreed()
  {
    return breed;
  }
  public String speak()
  {
    return "Woof";
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Dog))
    {
      return false;
    }
    Dog other = (Dog)obj;
    return super.equals(other) && other.breed.equals(breed);
  }
}
