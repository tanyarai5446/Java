import java.util.Scanner;
public class Countdown {
    public static void main(String[]args)throws InterruptedException{
        //thread delays output or sleeps for sometime
        //like countdown
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many seconds countdown you want: ");
        int start=sc.nextInt();
        for(int i=start;i>0;i--)
        {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Happy Birthday");
    }
}
