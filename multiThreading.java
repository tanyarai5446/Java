public class multiThreading {
    public static void main(String[]args)
    {
        //MultiThrreading= enables program to run multiple threads concurrently
        Thread t1 =new Thread(new Myrun("ping"));
        Thread t2 =new Thread(new Myrun("pong"));
        System.out.println("GAME START!");
         t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch(InterruptedException e)
        {
            System.out.println("Thread got interrupted");
        }
        catch(NoClassDefFoundError e)
        {
            System.out.println("Thread got interrupted");
        }

        System.out.println("GAME over!");
    }
}
class Myrun implements Runnable {
    private final String text;
    Myrun(String text)
    {
        this.text=text;
    }
    @Override
    public void run(){
        for(int i = 1;i<=5;i++)
        {
            try {
                Thread.sleep(1000);
                System.out.println(text);
            } catch (InterruptedException e) {
                System.out.println("Thread got interrupted");
            }
        }
    }
}
