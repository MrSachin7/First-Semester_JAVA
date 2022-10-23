//Write an application that creates an integer array (sourceArray) using an initialization list,
//to initialize it to some values of your choice. Then create a new array (destinationArray)
//and in a loop copy all elements from sourceArray to destinationArray. Then use a loop to
//print out the (hopefully identical) contents of the two arrays.

public class CopyArray
{
  public static void main(String[] args)
  {
    int[] sourceArray ={1,2,3,4,5,6,7,8,9,10};
    int[] destinationArray = new int[sourceArray.length];
    for (int i =0; i< sourceArray.length; i++)
    {
      destinationArray[i]=sourceArray[i];
      System.out.print(destinationArray[i]+" ");
    }
  }
}
