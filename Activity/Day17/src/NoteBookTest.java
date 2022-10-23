public class NoteBookTest
{
  public static void main(String[] args)
  {
    Note note1 = new Note("This excercise is kinda hard");
    Note note2 = new Note("This  excercise is finally completed");
    NoteBook notebook1 =new NoteBook();
    notebook1.addNote(note1);
    notebook1.addNote(note2);
    note1.setHighPriority();
    notebook1.addNote("This is added through message");


    Note[] temp = notebook1.getAllNotes();
    for (int i =0; i< temp.length;i++)
    {
      System.out.println(temp[i]);
    }
  }
}
