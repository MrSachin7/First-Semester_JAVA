public class MydateTest {
    public static void main(String[] args) {
        Mydate date1 = new Mydate(25, 9, 2002);
        Mydate date2 = new Mydate(28,02,2022);
        int count = 0;
        while (!date1.equals(date2)) {
            count++;
            date1.nextday();
        }
        System.out.println("Total number of days in beetween :"+ count);

    }
}
