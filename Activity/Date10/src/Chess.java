//There is an old story about a wise man (in some versions of the story it's the guy who
//invented the game of chess) who does some kind of favor for a king (in the versions with
//the chess creator the favor was simply that he created that game). The king is very
//grateful and wants to pay the wise man some money, but the wise man presents another
//idea for his payment, and because it appears to be very modest the king instantly accepts.
//That was a mistake...
//The payment idea that the wise man presented worked like this: The king should take a
//standard 8x8 square chessboard, and on the first square he should place a single grain of
//wheat, on the second square two grains, on the third square 4 grains, and so on doubling
//the number of grains each time he moved to the next square. His payment would then
//simply consist of the number of wheat grains that should be on the chessboard.
//Create a program that uses a loop to calculate the number of grains on the last square of
//the chessboard, plus the total number of grains on the chessboard. Hint: Since the wise
//man was indeed wise, you will need to store the values in a double, since neither int nor
//long will be able to hold such large values.

public class Chess
{
  public static void main(String[] args)
  {
    double totalWheatGrains = 0;
    double wheatGrains = 0;


    for (int i =1; i<=64;i++)
    {
      wheatGrains =Math.pow(2,i);
      totalWheatGrains+= wheatGrains;
    }
    System.out.println("The nummber of wheat grains on last square is "+wheatGrains );
    System.out.println("the total prize the wise man is recieving is "+ totalWheatGrains);

  }
}
