import java.util.Scanner;
public class varargs {
    public static void main(String[]args){
        //varargs = allows a method to accepts various # of args
        //          makes method more flexible,no need of overloaded method
        //          java will pack arguments into an array
        //          ... (ellipsis)
        System.out.print(avg(1,2,3));
    }
    static double avg(double ...num)
    {
        if(num.length==0)
            return 0;
        double sum=0;
        for(double i : num)
        {
            //System.out.println(i);
            sum+=i;
        }
        return sum/num.length;
    }
}
