public class Test
{
  public static void main(String[] args)
  {
    Date date1 = new Date(11,5,2021);
    Date date2 = new Date(10,5,2021);
    Date vaccinationDate= new Date(28,4,2021);
    Date testedDate = new Date(29,4,2021);

    Resource resource1 = new Resource("SDJAssignment","pdf");
    Resource resource2 = new Resource("SEPAssignment","jpeg");

    Time startTime = new Time(10,5,25);
    Time endTime = new Time(18,30,26);

    Resource[] resourcesArray ={resource1,resource2};


    DiscordLesson sdjLesson = new DiscordLesson("JAVA",date1,startTime,endTime,resourcesArray,false,"VIA Discord Channel");
    ZoomLesson sseLesson = new ZoomLesson("Study Skills",date2,startTime,endTime,resourcesArray,true,"https://viadk.zoom.us/j/8509951089?pwd=SndiUWpxbVhxSEt1MFVyY2lhamUvUT09",true);
    Lesson marketingLesson = new Lesson("Marketing strategies",date1,startTime,endTime,resourcesArray);
    Lesson researchLesson = new Lesson("Research Strategies",date2,startTime,endTime,resourcesArray);

    Course softwareTechnologyEngineering = new Course("VIA Software Engineering");
    Course marketingAndResearch = new Course("VIA Marketing and Research");

    softwareTechnologyEngineering.addLesson(sdjLesson);
    softwareTechnologyEngineering.addLesson(sseLesson);

    marketingAndResearch.addLesson(marketingLesson);
    marketingAndResearch.addLesson(researchLesson);


    Grade grade1 = new Grade(12,softwareTechnologyEngineering);
    Grade grade2 = new Grade(7,marketingAndResearch);

    CoronaPassport coronaPassport1 = new CoronaPassport("vaccinated",vaccinationDate);
    CoronaPassport coronaPassport2 = new CoronaPassport("Tested",testedDate);

    Student student1 = new Student(310628,"Sachin Baral");
    Student student2 = new Student(425132,"Alexandra Botez");

    student1.addCourse(softwareTechnologyEngineering);
    student1.addGrade(12,softwareTechnologyEngineering);
    student1.addCoronaPassport(coronaPassport1);

    student2.addCourse(marketingAndResearch);
    student2.addCoronaPassport(coronaPassport2);
    student2.addGrade(7,marketingAndResearch);

    System.out.println(sseLesson.getDateTimeString());
    System.out.println(student1.hasValidCoronaPassport());

    for (int i =0; i< student2.getALlCourses().length;i++)
    {
      System.out.println(student2.getALlCourses()[i]);
    }

  }
}
