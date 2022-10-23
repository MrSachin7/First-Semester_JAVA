//Write a program that reads an age (int) from the keyboard and then prints a message. The
//message should depend on the typed value in the following way:
//• If the age is less than 0 display the message: "Error in age value".
//• If the age is between 0 and 12 (both included) display the message: "Child".
//• If the age is between 13 and 19 (both included) display the message: "Teenager".
//• If the age is between 20 and 65 (both included) display the message: "Adult".
//• If the age is larger than 65 display the message: "Senior citizen".
//Test the program by running it at least 5 times to be sure that it will print out the correct
//message for each age group
public class Age
{
  private int age;
  private String type;

  public  Age(int age)
  {
    this.age =age;
  }
  public void setAge(int age)
  {
    this.age = age;
  }
  public int getAge()
  {
    return  age ;
  }
}
