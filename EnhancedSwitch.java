import java.util.Scanner;
public class EnhancedSwitch {
    public static void main(String[]args)
    {
        //Enhanced switch = a replacement to many if else statement
        //                  (java 14 feature)

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a day: ");
        String day = sc.nextLine();
        switch(day){
            case "Monday","Tuesday","Wednesday","Thursday","Friday"->System.out.print("\nIts is a weekday 🫡");
            case "Saturday","Sunday"->System.out.print("\nIt is weekend 😀");
            default->System.out.print(day + " is not a day");
        }
        sc.close();
    }

}
