import java.util.Scanner;
public class searchELE {
    public static void main(String[]args){
        int[] numbers={1,2,5,8,3};
        String[] foods={"apple","orange","banana"};
        System.out.print("Enter target: ");
        Scanner sc = new Scanner(System.in);
        String t=sc.nextLine();
        boolean isfound=false;
        for(int i=0;i<foods.length;i++)
        {
            //if(t==numbers[i])
            if(foods[i].equals(t))//in case of string we use equals as using == may store memory address
            {
                System.out.print("fruit found at index "+i);
                isfound=true;
                break;
            }
        }
        if(!isfound){
            System.out.print("fruit not found");}
    }
}
