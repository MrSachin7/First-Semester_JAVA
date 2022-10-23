
public class Resource
{
  private String fileName;
  private String extension;

  public Resource(String fileName, String extension)
  {
    this.fileName=fileName;
    this.extension=extension;
  }
  public boolean isPDF()
  {
    if (extension.toUpperCase().equals("PDF"))
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Resource))
    {
      return false;
    }
    else
    {
      Resource other = (Resource)obj;
      return other.extension.toUpperCase().equals(extension.toUpperCase()) && other.fileName.toUpperCase().equals(fileName.toUpperCase());
    }
  }
  public String toString()
  {
    return "FileName :"+fileName+"\n Extension :"+extension;
  }
}
