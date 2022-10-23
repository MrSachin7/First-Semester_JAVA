public class Book
{
  private String name;
  private String author;
  private double price;
  private int pages;

  public Book()
  {
    name = "Programming with JAVA";
    author = "Sachin Baral";
    price = 2500;
    pages = 654;
  }

  public Book(String name, String author, double price, int pages)
  {
    this.name = name;
    this.author = author;
    this.price = price;
    this.pages = pages;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAuthor(String author)
  {
    this.author = author;
  }

  public void setPrice(double price)
  {
    this.price = price;
  }

  public String getName()
  {
    return name;
  }

  public String getAuthor()
  {
    return author;
  }

  public double getPrice()
  {
    return price;
  }

  public int getPages()
  {
    return pages;
  }

  public String toString()
  {
    return author + " wrote " + name + " which has " + pages
        + " pages which costs " + price;
  }
}
