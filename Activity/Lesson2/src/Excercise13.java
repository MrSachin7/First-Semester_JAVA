// The word game
import java.util.Scanner;

public class Excercise13
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter your name");
    String name = keyboard.nextLine();

    System.out.println("Enter your age ");
    int age = keyboard.nextInt();

    keyboard.nextLine();

    System.out.println("Enter your city");
    String city = keyboard.nextLine();

    System.out.println("Enter your college");
    String college = keyboard.nextLine();

    System.out.println("Enter your profession");
    String profession = keyboard.nextLine();

    System.out.println("Enter the name of animal");
    String animal = keyboard.nextLine();

    System.out.println("Enter the pet's name ");
    String petName = keyboard.nextLine();

    System.out.print(
        "There once was a person named " + name + " who lived in " + city
            + ". At the age of " + age + ",\n" + name
            + " went to the college at " + college + ". " + name
            + " graduated and went to \nwork as a " + profession + ". Then, "
            + name + " adopted a "
            + "" + animal + " named " + petName + ". They both \nlived happily ever after!");
  }
}
