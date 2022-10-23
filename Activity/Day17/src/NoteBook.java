//Update the Notebook class from Exercise 16.02 so that it now uses an
//ArrayList<Note> instead of a regular array to store the notes.
//Make a no-argument constructor that creates a notebook that can store 5 notes (optionally
//also create the ArrayList with a start size of 5 to save a little memory).
//Then also create a one-argument constructor used to specify the size of the notebook.
//Even though an ArrayList can expand its size dynamically, make sure that the notebook
//never contains more notes than it should, by restricting the add methods.

import java.util.ArrayList;

public class NoteBook
{
  private ArrayList<Note> notes;
  private int noOfNotes;

  public NoteBook()
  {
    notes = new ArrayList<Note>(5);
    noOfNotes=5;
  }

  public NoteBook(int size)
  {
    notes = new ArrayList<Note>(size);
    noOfNotes=size;
  }

  public int getNumberOfNotes()
  {
    return notes.size();
  }

  public Note getNote(int index)
  {
    if (index <= notes.size())
    {
      return notes.get(index).copy();
    }
    else
    {
      System.out.println("Index exceeded the size");
      return null;
    }
  }

  public String getMessage(int index)
  {
    if (index <= notes.size())
    {
      return notes.get(index).getMessage();
    }
    else
      return "Index exceeded the size";
  }

  public void addNote(Note note)
  {
    if (notes.size()<noOfNotes)
    notes.add(note);
  }
  public void addNote(String message)
  {
    Note temp =new Note(message);
    notes.add(temp);

  }

  public void addHighPriorityNotes(String message)
  {
    Note temp = new Note(message);

    notes.add(temp);
    temp.setHighPriority();
  }

  public void removeNote(int index)
  {
    notes.remove(index);
  }

  public Note[] getAllNotes()
  {
    Note[] tempArray = new Note[notes.size()];
    Note[] newArray = notes.toArray(tempArray);
    return newArray;
  }

  public int getNumberOfHighPriorityNotes()
  {
    int count = 0;
    for (int i = 0; i < notes.size(); i++)
    {

      if (notes.get(i).isHighPriority())
      {
        count++;
      }
    }
    return count;
  }

  public Note[] getAllHighPriorityNotes()
  {
    Note[] tempArray = new Note[getNumberOfHighPriorityNotes()];
    int index = 0;
    for (int i = 0; i < notes.size(); i++)
    {
      tempArray[index++] = notes.get(i).copy();
    }
    return tempArray;
  }
  public String toString()
  {
    return "Number of notes :" + getNumberOfNotes()
        + "\n Number of high priority notes :" + getNumberOfHighPriorityNotes();
  }

}

