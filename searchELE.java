import java.util.Scanner;
public class searchELE {
    public static void main(String[]args){
        int[] numbers={1,2,5,8,3};
        System.out.print("Enter target: ");
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        boolean isfound=false;
        for(int i=0;i<numbers.length;i++)
        {
            if(t==numbers[i])
            {
                System.out.print("element found at index "+i);
                isfound=true;
                break;
            }
        }
        if(!isfound){
            System.out.print("element not found");}
    }
}
