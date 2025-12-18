import java.util.Scanner;
public class RuntimePoly {
    public static void main(String[]args)
    {
        //runtime polymorphism= when the method that gets executed is decided at runtime based on the actual type of theobj.
        Scanner sc=new Scanner(System.in);
        animall animal;
        System.out.println("Would you like a dog or a cat? (1=dog ,2=cat)");
        int choice=sc.nextInt();
        //deciding at the runtime which class to call
        switch(choice)
        {
            case 1->{
                animal=new dogg();
            animal.speak();
            }
            case 2-> {
                animal=new catt();
            animal.speak();
            }
            default->System.out.println("invalid choice");
        }
//        dogg d= new dogg();
//        catt c=new catt();
//        d.speak();
//        c.speak();
    }
}
interface animall {
    void speak();
}
class dogg implements animall{
    @Override
    public void speak()
    {
        System.out.println("The dog goes 'woof' ");
    }
}
class catt implements animall{
    @Override
    public void speak()
    {
        System.out.println("The cat goes 'meow' ");
    }
}
