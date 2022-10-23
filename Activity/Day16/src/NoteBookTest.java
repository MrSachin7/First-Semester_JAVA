public class NoteBookTest
{
  public static void main(String[] args)
  {
    Note note1 = new Note("This excercise is kinda hard");
    Note note2= new Note("This  excercise is finally completed");
    NoteBook noteBook1 = new NoteBook(6);
    noteBook1.addNote(note1);
    noteBook1.addNote(note2);
    note1.isHighPriority();
    Note[] array=noteBook1.getAllNotes();
    Note[] array2 =noteBook1.getAllHighPriorityNotes();

    for (int i=0; i< array.length;i++ )
    {
      System.out.println(array[i].getMessage());
    }
    for (int i=0; i< array2.length;i++ )
    {
      System.out.println(array2[i].getMessage());
    }

  }
}
