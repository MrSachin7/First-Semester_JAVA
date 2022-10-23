public class IllegalInputException extends RuntimeException
{
  public IllegalInputException()
  {
    super("Enter either 'Vaccinated' , 'Tested' or 'Infected' .");
  }
}