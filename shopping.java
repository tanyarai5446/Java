import java.util.Scanner;
public class shopping {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        String item;
        double price=199.9;
        int quantity;
        double total;
        char currency='₹';
        System.out.print("What do you want to order?: ");
        item=sc.nextLine();
        System.out.println("Price for the item is : "+currency+price);
        System.out.print("How many do you want to order?: ");
        quantity=sc.nextInt();
        System.out.println("you have ordered "+quantity+" "+item+"/s");
        total=price*quantity;
        System.out.print("Your total is "+currency+total);

        sc.close();
    }

}
