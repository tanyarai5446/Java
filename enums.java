import java.util.Scanner;
public class enums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day: ");
        String response = sc.nextLine().toUpperCase();
        try {
            Day day = Day.valueOf(response);
            switch (day) {
                case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.print("weekday");
                case SATURDAY, SUNDAY -> System.out.print("weekend");
                default -> System.out.print("not a valid day");
            }
        } catch (IllegalArgumentException e) {
            System.out.print("something went wrong");
        }
    }
}
enum Day{
    SUNDAY(1),MONDAY(2),TUESDAY(3),WEDNESDAY(4),THURSDAY(5),FRIDAY(6),SATURDAY(7);
    private final int daynum;
    Day(int daynum)
    {
        this.daynum=daynum;
    }
   public int getday(){
        return this.daynum;
    }
}
