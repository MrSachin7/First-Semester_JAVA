import javax.security.sasl.SaslClient;

public class CourseTest
{
  public static void main(String[] args)
  {
    Student student1 = new Student("Sachin Baral",1);
    Student  student2 = new Student("Himal Sharma",2);
    Instructor instructor1= new Instructor("Allan",308);
    Instructor instructor2= new Instructor("Mona",309);
    Course SDJ = new Course("Java ", instructor1);
    Course SSE = new Course("Study skills", instructor2);
    SDJ.addStudent(student1);
    SDJ.addStudent(student2);
    SSE.addStudent(student1);
    SSE.addStudent(student2);
    System.out.println(SDJ.hasStudent("Sachin Baral"));
  }
}
