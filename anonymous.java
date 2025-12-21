public class anonymous {
    public static void main(String[]args)
    {
        //Anonymous class=cant be reused,,doesnt have a name,,custom behaviour withou creating a new class
        //often used for one time uses(TimerTask,Runnable,callbacks)
        lion l1=new lion();
        lion l2=new lion(){
            @Override
            void speak()
            {
                System.out.print("Simba says english");
            }
        };
        l1.speak();
        l2.speak();
    }
}
class lion{
    void speak()
    {
        System.out.println("The lion goes rawr-rawr");
    }
}
