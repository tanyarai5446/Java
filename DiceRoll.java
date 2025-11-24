import java.util.Scanner;
import java.util.Random;
public class DiceRoll {
    //as per user imput diplay dots on dice
    public static void main(String[]args){
     //java dice roll program

        Scanner sc = new Scanner(System.in);
        Random rd=new Random();
        int num;
        int total=0;
        System.out.print("Enter a number of dice to roll: ");
        num=sc.nextInt();
        if(num>0)
        {
            for(int i=0;i<num;i++)
            {
                int roll=rd.nextInt(1,7);
                printdie(roll);
                System.out.println("\nyou rolled: "+roll);
                total+=roll;
            }
            System.out.print("\nTotal: "+total);
        }
        else
            System.out.print("number of dice must be greater than 0");
    }
    static void printdie(int roll){
        String dice1= """
                -------
               |       |
               |   ●   |
               |       |
                -------
                """;
        String dice2= """
                -------
               | ●     |
               |       |
               |     ● |
                -------
                """;
        String dice3= """
                -------
               | ●     |
               |   ●   |
               |     ● |
                -------
                """;
        String dice4= """
                -------
               |●     ●|
               |       |
               |●     ●|
                -------
                """;
        String dice5= """
                -------
               |●     ●|
               |   ●   |
               |●     ●|
                -------
                """;
        String dice6= """
                -------
               |●     ●|
               |●     ●|
               |●     ●|
                -------
                """;
        switch(roll)
        {
            case 1->System.out.print(dice1);
            case 2->System.out.print(dice2);
            case 3->System.out.print(dice3);
            case 4->System.out.print(dice4);
            case 5->System.out.print(dice5);
            case 6->System.out.print(dice6);
            default->System.out.print("invalid choice");
        }
    }
}
