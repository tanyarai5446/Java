import java.util.Scanner;
import java.util.Random;
public class slotMachine {
    public static void main(String[]args){
        //slot machine
        Random rd=new Random();
        Scanner sc = new Scanner(System.in);
        int balance=100;
        String playagain="yes";
        String[] symbol = {"🍬", "🍊", "🍒", "⭐", "❤️"};
        System.out.println("WELCOME TO JAVA SLOT MACHINE");
            do {

                System.out.println("Current balace = $" + balance);
                System.out.print("Place your bet amount - ");
                int bet= sc.nextInt();
                sc.nextLine();
                if(bet>balance){
                    System.out.println("Insufficient funds!");
                    continue;
                }
                else if(bet <=0)
                {
                    System.out.println("bet must be greater than 0!");
                    continue;
                }
                else {
                    balance -= bet;
                }
                System.out.println("SPINNING▪▪▪");
                String c1=symbol[rd.nextInt(4)];
                String c2=symbol[rd.nextInt(4)];
                String c3=symbol[rd.nextInt(4)];
                System.out.println(c1+" | "+c2+" | "+c3);
                int payout=getpayout(bet,c1,c2,c3);
                if(payout>0)
                {
                    System.out.print("you won   $"+payout);
                    balance+=bet;
                }
                else{
                    System.out.println("Sorry you have lost the game");
                }
                System.out.println("\nCurrent balace = $" + balance);
                System.out.print("Do you want to play again(yes/no)- ");
                playagain = sc.nextLine();

            } while (playagain.equals("yes"));

        System.out.println("\nFinal balance = $"+balance);
    }
    static int getpayout(int bet,String c1,String c2,String c3)
    {
        if(c1.equals(c2)&&c2.equals(c3)&&c1.equals(c3)) {
            return switch (c1) {
                case "🍬" -> bet * 3;
                case "🍊" -> bet * 4;
                case "🍒" -> bet * 5;
                case "❤️" -> bet * 10;
                case "⭐" -> bet * 20;
                default -> 0;
            };
        }
        else if(c1.equals(c2))
        {
            return switch (c1) {
                case "🍬" -> bet * 2;
                case "🍊" -> bet * 3;
                case "🍒" -> bet * 4;
                case "❤️" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        else if(c2.equals(c3))
        {
            return switch (c2) {
                case "🍬" -> bet * 2;
                case "🍊" -> bet * 3;
                case "🍒" -> bet * 4;
                case "❤️" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        else if(c1.equals(c3))
        {
            return switch (c1) {
                case "🍬" -> bet * 2;
                case "🍊" -> bet * 3;
                case "🍒" -> bet * 4;
                case "❤️" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        else if(!c1.equals(c2)&&!c2.equals(c3))
        {
            return 0;
        }
        return 0;
    }
}
