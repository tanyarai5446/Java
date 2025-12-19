import java.util.Scanner;
import java.util.InputMismatchException;
public class exception {
    public static void main(String[]args)
    {
        //exception = event that interrupts normal flow of a program
        //                       (dividing by zero,file not found,mismatch input tpe)
        //                        surround any dangerous code with try{} b;ock
        //                        try{},catch{},finally{}

        try(Scanner sc=new Scanner(System.in))
        {
            System.out.print("Enter a number : ");
            int num=sc.nextInt();//on typing wrong i/p we get InputMismatchException
            System.out.println(1/0);//gives arithmeticException
        }
//        catch(ArithmeticException e){//copy these exceptions from the terminal and use a nickname e with it
//            System.out.println("you cant divide 1 by 0! IDIOT");
//        }
//        catch(InputMismatchException e){
//            System.out.println("Thats not a number");
//        }
        catch(Exception e)
        {
            //safety net  { professional way for all exceptions}
            System.out.println("Something went wrong");
        }
        finally
        {
            System.out.println("this always executes");
        }
    }
}
