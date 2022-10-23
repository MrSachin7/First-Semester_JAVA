public class AnimalTest
{
  public static void main(String[] args)
  {
    Animal frog= new Frog(2,"green");
    Animal bee=new Bee(1,true);
    Animal dog = new Dog(9,"Spike","I dont know the breed");
    Animal cat= new Cat(4,"Tom",true);
    Animal[] animals= new Animal[4];
    animals[0] = frog;
    animals[1]=bee;
    animals[2]=dog;
    animals[3]=cat;
    System.out.println(animals[1].speak());

    for (int i=0; i< animals.length;i++)
    {
      System.out.println(animals[i].speak());
    }
  }
}
