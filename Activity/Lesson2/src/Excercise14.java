public class Excercise14
{
  public static void main(String[] args)
  {
    double noOfSales = 1000;
    double pricePerShare = 32.87;
    double totalPricePaid = noOfSales * pricePerShare;
    double commissionWhileBuying = 0.02 * totalPricePaid;

    //NOW HE HAS SOLD THE STOCK
    double pricePerSale = 33.92;
    double totalPricerecieved = pricePerSale * noOfSales;
    double commissionAgain = 0.02 * totalPricerecieved;
    double totalcommissionpaid = commissionWhileBuying + commissionAgain;
    double profit = (totalPricerecieved - totalPricePaid) - (totalcommissionpaid);

    System.out.print(
        "The amount of money Joe paid for the stock = $" + totalPricePaid
            + "\nThe amount of commsission Joe paid his broker when he bought the stock = $"
            + commissionWhileBuying
            + "\n The amount that Joe sold the stock for = $"
            + totalPricerecieved
            + "\nThe amount of commission that Joe paid his broker when he sold his stock = $"
            + commissionAgain + "\nThe net profit Joe made = $"+ profit);

  }
}
