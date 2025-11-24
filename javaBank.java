import java.util.Scanner;
public class javaBank {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[]args){

        int balance=0;
        boolean isrunning=true;
        int choice;
        while(isrunning) {
            System.out.println("Welcome to java Bank system:");
            System.out.println("Please select a option: ");
            System.out.println("1.Deposit.");
            System.out.println("2.Withdraw.");
            System.out.println("3.Transfer");
            System.out.println("4.Check Balance:");
            System.out.println("5.Exit Program");
            System.out.print("Enter your choice between 1-5: ");
            choice = sc.nextInt();
            switch(choice){
                case 1-> {
                    balance+=deposit(balance);
                         System.out.println("Total balance after deposit: "+balance);
                }
                case 2-> {
                    balance-=withdraw(balance);
                         System.out.println("Total balance after withdraw: "+balance);
                }
                case 3->showbal(balance);
                case 4->{
                    System.out.println("Enter account number to transfer to: ");
                    int accNo=sc.nextInt();
                    System.out.println("Enter amount to transfer: ");
                    int amount=sc.nextInt();
                    if(amount>balance)
                        System.out.println("Insufficient balance. ");
                    else{
                        balance-=amount;
                    System.out.println("Succesfull transaction ");
                    System.out.println("total balance: "+balance);}
                }
                case 5-> isrunning=false;
                default-> System.out.println("Invalid choice.Try again!");
            }
        }
            sc.close();
    }
    static int deposit(int balance){
        System.out.print("Enter the amount to deposit: ");
        int amount=sc.nextInt();
        return amount;

    }
    static int withdraw(int balance)
    {
        System.out.print("Enter the amount to withdraw: ");
        int amount=sc.nextInt();
        if(amount>balance){
            System.out.println("Insufficient balance!");
            return 0;}
        else{
            return amount;}
    }
    static void showbal(int balance)
    {

        System.out.print("Total balance : "+balance);

    }
}

