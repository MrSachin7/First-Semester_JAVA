import java.io.IOException;

public class Test
{
  public static void main(String[] args) throws IOException
  {
    Student student1 = new Student("Sachin ", "Baral", "Nepal");
    Student student2 = new Student("Himal", "Sharma", "Nepal");
    Student student3 = new Student("Bartosz", "Zielinski", "Poland");
    Student student4 = new Student("Emil", "Vassilev", "Bulgaria");
    Student student5 = new Student("Marian", "Radu", "Romania");
    Student[] students = {student1, student2, student3, student4, student5};
    StudentList studentList = new StudentList();
    studentList.add(student1);
    studentList.add(student2);
    StudentList studentList2 = new StudentList();
 studentList2.add(student3);
 studentList2.add(student4);
    MyFileHandler.writeToBinaryFile("StudentGUI/students.bin", studentList);
    MyFileHandler.writeToBinaryFile("StudentGUI/students.bin", studentList2);

  }
}
