import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;
public class TimerTaskClass {
    public static void main(String[]args)
    {
        //Timer=Class that schedules tasks at specific time or periodically
        //             useful for: sending notifications,scheduled updates,repetitive actions

        //TimerTask=Represents the task that will be executed by the timer
        //                      you will extend TimerTask class to define your task
        //                      create a subclass of TimerTask and @override run
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the  # seconds to countdown from: ");
        int count=sc.nextInt();
        Timer timer=new Timer();

        TimerTask task=new TimerTask(){
            int j=count;
            @Override
            public void run()
            {
                System.out.println(j);
                if(j==0){
                    System.out.print("HAPPY BIRTHDAY");
                    timer.cancel();
                }
                j--;
            }
        };

        timer.schedule(task,2000,1000);
    }
}
