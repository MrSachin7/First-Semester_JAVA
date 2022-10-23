public class CoronaPassport
{
  private String reason;
  private Date date;

  public CoronaPassport(String reason, Date date)
  {
    if (reason.toUpperCase().equals("VACCINATED") || reason.toUpperCase().equals("TESTED") || reason.toUpperCase().equals("INFECTED"))
    {
      this.reason = reason;
      this.date = date.copy();
    }
    else
    {
      throw new IllegalInputException();
    }
  }

  public String getReason()
  {
    return reason;
  }

  public Date getDate()
  {
    return date.copy();
  }

  public String toString()
  {
    return "Reason :"+reason+ "\nDate:" +date;
  }

}
