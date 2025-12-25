import java.util.Scanner;
import java.util.Random;
import java.lang.Thread;
public class threadClass {
    public static int count=0;
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Random rd=new Random();
        MyRunnable my=new MyRunnable();
        Thread thread =new Thread(my);
        thread.setDaemon(true);      // this tread ends the thread running in background (Myrunnable) as soon as the main thread ends
        thread.start();
        char c='Y';

        while(c=='Y') {
            System.out.println("Youe have 20 seconds to write 10 multiple of the # number generated on screeen");
            int rand = rd.nextInt(2, 11);
            System.out.print("The number is  " + rand);
            for (int i = 1; i <= 10; i++) {
                int multiple = sc.nextInt();
                if (multiple % rand != 0) {
                    System.out.println("wrong multiple!");
                    System.out.println("you lost!");
                    System.out.print("Do you want to retake? Y/N : ");
                     c = sc.next().charAt(0);
                    switch(c){
                        case 'Y'->System.out.println("All the best!");
                        case 'N'->{
                            c='N';
                            System.out.println("Thanks for playing");
                            return;
                        }
                        default->System.out.println("invalid input");
                    }
                }
                count++;    // to count how many correct;
            }
        }
    }
}
class MyRunnable implements Runnable {
    @Override
    public void run(){
         for(int i = 1;i<=20;i++)
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread got interrupted");
        }
        if (i == 10) {
            System.out.println("\nTime's up!");
            if(threadClass.count<5)
                System.out.println("Could have done better!");
           else if(threadClass.count>5)
                System.out.println("you wrote "+threadClass.count+" multiples!! Not too bad");
            System.exit(0);   // to exit as sson  as the times up!!

        }
    }
}
}

