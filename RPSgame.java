import java.util.Scanner;
import java.util.Random;
import javax.swing.*;
import java.awt.Font;
public class RPSgame {
    public static void main(String[]args){
        // rock paper scissor game
        Scanner sc = new Scanner(System.in);
        String playerchoice;
        String computerchoice;
        String[] choice={"rock","paper","scissor"};
        String playagain="yes";
        Random rd= new Random();

           do{
            System.out.print("Enter your choice(rock,paper,scissor)-");
            playerchoice=sc.nextLine().toLowerCase();
            if(!playerchoice.equals("rock")
            && !playerchoice.equals("paper")
            && !playerchoice.equals("scissor"))
            {
                System.out.print("invalid choice");
                continue;
            }
            computerchoice = choice[rd.nextInt(3)];
            System.out.print("computer plays-"+computerchoice+"\n");

            String resultText = disp(playerchoice, computerchoice);

            if(playerchoice.equals(computerchoice))
            {
                System.out.println(resultText);
                System.out.print("Its a tie");
            }
            else if((playerchoice.equals("rock")&&computerchoice.equals("scissor"))||
                    (playerchoice.equals("paper")&&computerchoice.equals("rock"))||
                    (playerchoice.equals("scissor")&&computerchoice.equals("paper")))
            {
                System.out.println(resultText);
                System.out.print("you won");
            }
            else
            {
                System.out.println(resultText);
                System.out.print("you lose");
            }
            System.out.print("\nplay again?(yes/no)-");
            playagain=sc.nextLine();

        }while(playagain.equals("yes"));

        System.out.print("Thanks for playing!");
    }
    static String disp(String player,String computer){

        String rs= """
                ✊  v/s   ✌️
                """;
        String sp= """
                ✌️  v/s   🖐️
                """;
        String pr= """
                🖐️  v/s   ✊
                """;
        String rr= """
                ✊  v/s   ✊
                """;
        String ss= """
                ✌️  v/s   ✌️
                """;
        String pp= """
                🖐️  v/s   🖐️
                """;
        String sr = """
                ✌️  v/s   ✊
                """;
        String ps= """
                🖐️  v/s   ✌️
                """;
        String rp= """
                ✊  v/s   🖐️
                """;
        String key=player+"-"+computer;
        switch(key)
        {
            case "rock-scissor":return rs;
            case "scissor-paper":return sp;
            case "paper-rock":return pr;
            case "paper-paper":return pp;
            case "scissor-scissor":return ss;
            case "rock-rock":return rr;
            case "scissor-rock":return sr;
            case "paper-scissor":return ps;
            case "rock-paper":return rp;
            default: return "Invalid input";
        }
    }
}

