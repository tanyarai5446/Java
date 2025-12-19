import java.util.ArrayList;
import java.util.Scanner;
public class arraylist {
    public static void main(String[]args) {
        //wrapper class= Allow primitive values(int,char,bool,double) to behave like obj.
        //                             Generally dont wrap primitives unless u need an obj
        //                              Allows use of collection framework and utilities methods
        // Arraylist<int> list   ->not allowed   {collections cant store primitives}
        //Arraylist<Integer> list   ->allowed
        //int z= Integer.paseInt("123")             {provide utility methods}

       //ArrayList  = resizeable array that stores objects
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the # of  toys you want: ");
        int c=sc.nextInt();
        sc.nextLine();
        ArrayList<String> toys=new ArrayList<>();
        for(int i=1;i<=c;i++)
        {
            System.out.println("Enter toy "+ i +" : ");
            String toy=sc.nextLine();
            toys.add(toy);
        }
        System.out.println(toys);
    }
}

