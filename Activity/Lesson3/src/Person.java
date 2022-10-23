//The Person class
//Create a class called Person representing a person with 2 fields: A name
//(String) and a birthday (String).
//a) First draw a UML class diagram of the class (use astah).
//b) Then implement the class Person in Java.
//c) Add get and set methods for the fields.
//d) Implement a test class with a main method for your class Person,
//where you create at least two Person objects, use the set methods
//to assign values to the fields, and then finally print out the values by
//using the get methods

public class Person

{
  private String name;
  private String birthday;

  public void setName(String n)

  {
    name = n;
  }

  public void setBirthday(String b)

  {
    birthday = b;
  }

  public String getName()

  {
    return name;
  }

  public String getBirthday()

  {
    return birthday;
  }
}
