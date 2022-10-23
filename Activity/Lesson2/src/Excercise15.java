import java.util.Scanner;

public class Excercise15
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter the no of sales purchased");
    double noOfSalesPurchased = keyboard.nextDouble();
    keyboard.nextLine();

    System.out.println("Enter the price per share when buying");
    double pricePerShareBuying = keyboard.nextDouble();
    keyboard.nextLine();

    System.out.println("Enter the commission rate");
    double commissionRate = keyboard.nextDouble();
    keyboard.nextLine();

    System.out.println("Enter the no of sales sold");
    double noOfsalesSold = keyboard.nextDouble();
    keyboard.nextLine();

    System.out.println("Enter the price per share when selling");
    double pricePerShareSelling = keyboard.nextDouble();
    keyboard.nextLine();

    double totalPricePaid = noOfSalesPurchased * pricePerShareBuying;
    double commissionWhileBuying =commissionRate *totalPricePaid;
    double totalPriceRecieved = noOfsalesSold * pricePerShareSelling;
    double commissionWhileSelling = commissionRate * totalPriceRecieved;
    double totalCommissionPaid = commissionWhileBuying + commissionWhileSelling;
    double profit = (totalPriceRecieved - totalPricePaid) - totalCommissionPaid;
    System.out.print(
        "The amount of money Joe paid for the stock = $" + totalPricePaid
            + "\nThe amount of commsission Joe paid his broker when he bought the stock = $"
            + commissionWhileBuying
            + "\n The amount that Joe sold the stock for = $"
            + totalPriceRecieved
            + "\nThe amount of commission that Joe paid his broker when he sold his stock = $"
            + commissionWhileSelling+ "\nThe net profit Joe made = $"+ profit);







  }
}
