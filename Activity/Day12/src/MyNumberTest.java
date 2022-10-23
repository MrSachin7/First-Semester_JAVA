public class MyNumberTest
{
  public static void main(String[] args)
  {
    MyNumber number =new MyNumber(28);
    MyNumber number2 = new MyNumber(4);
    System.out.println(number.numberOfproperDivisors());
    System.out.println(number.getFirstDigit());
    System.out.println(number.isPrime());
    System.out.println(number);
    System.out.println(number.plus(null));
    System.out.println(number.isPerfectNumber());

  }
}
