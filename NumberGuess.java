import java.util.Random;
import java.util.Scanner;
public class NumberGuess {
    public static void main(String[]args)
    {
        Random rd=new Random();
        int guess;
        int attempts=0;
        int randomNum=rd.nextInt(1,10);
        Scanner sc=new Scanner(System.in);
        System.out.println("Number guessing game");
        System.out.print("Guess a number between 1-100 ");
        do{
            System.out.print("\nEnter a guess: ");
            guess=sc.nextInt();
            if(guess<randomNum)
                System.out.print("Number too short. Try again!");
            else if(guess>randomNum)
                System.out.print("Number too long. Try again!");
            else
                System.out.print("Correct! Hurray, You won");
            attempts++;
        }while(guess!=randomNum);
        System.out.print("\nYou took "+attempts+" attempts to guess the number.");
    }
}
