//Implement the classes Note and Notebook shown in the class diagram below. The
//multiplicity on the composition indicates that a Notebook object can store multiple Note
//objects, so again use an array (Note[]) as instance variable in class Notebook. In the
//Notebook class the numberOfNotes instance variable indicates how many notes are
//currently in the notebook, while the maxNumberOfNotes parameter in the constructor is
//used to set the size of the array. Since the relationship between the classes is a composition,
//then remember to make copies of the Note objects when getting and setting them.
//Then implement a test class to test the functionality of the two classes.

public class NoteBook
{
  private int numberOfNotes;
  private Note[] notes;

  public NoteBook(int maxNumberOfNotes)
  {
    // numberOfNotes=0;
    notes = new Note[maxNumberOfNotes];
  }

  public int getNumberOfNotes()
  {
    int count = 0;
    for (int i = 0; i < notes.length; i++)
    {

      if (notes[i] != null)
      {
        count++;
      }
    }
    return count;
  }

  public Note getNote(int index)
  {
    if (notes[index] != null)
    {
      return notes[index].copy();
    }
    else
    {
      System.out.println("Note object is null");
      return null;
    }
  }

  public String getMessage(int index)
  {
    if (notes[index] != null)
    {
      return notes[index].getMessage();
    }
    else
    {
      System.out.println("Note object is null");
      return null;
    }
  }

  public void addNote(Note note)
  {
    for (int i = 0; i < notes.length; i++)
    {
      if (notes[i] == null)
      {
        notes[i] = note.copy();
        break;
      }
    }

  }

  public void addNote(String message)
  {
    Note temp = new Note(message);
    for (int i = 0; i < notes.length; i++)
    {
      if (notes[i] == null)
      {
        notes[i] = temp;
        break;
      }
    }

  }

  public void addHighPriorityNotes(String message)
  {
    Note temp = new Note(message);
    temp.setHighPriority();
    for (int i = 0; i < notes.length; i++)
    {
      if (notes[i] == null)
      {
        notes[i] = temp;
        break;
      }
    }
  }

  public void removeNote(int index)
  {
    notes[index] = null;
  }

  public Note[] getAllNotes()
  {
    Note[] temp = new Note[getNumberOfNotes()];
    int index = 0;
    for (int i = 0; i < notes.length; i++)
    {
      if (notes[i] != null)
      {
        temp[index++] = notes[i].copy();
      }

    }
    return temp;
  }

  public int getNumberOfHighPriorityNotes()
  {
    int count = 0;
    for (int i = 0; i < notes.length; i++)
    {
      if (notes[i] != null)
      {
        if (notes[i].isHighPriority())
        {
          count++;
        }
      }
    }
      return count;

  }

  public Note[] getAllHighPriorityNotes()
  {
    Note[] temp = new Note[getNumberOfHighPriorityNotes()];
    int index = 0;
    for (int i = 0; i < notes.length; i++)
    {
      if (notes[i] != null && notes[i].isHighPriority())
      {
        temp[index++] = notes[i].copy();
      }

    }
    return temp;
  }

  public String toString()
  {
    return "Number of notes :" + getNumberOfNotes()
        + "\n Number of high priority notes :" + getNumberOfHighPriorityNotes();
  }
}
