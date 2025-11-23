import java.util.Random;
import java.util.Scanner;
public class NumberGuess {
    public static void main(String[]args)
    {
        Random rd=new Random();
        int guess;
        int attempts=0;
        int randomNum=rd.nextInt(1,100);
        Scanner sc=new Scanner(System.in);
        System.out.println("Number guessing game");
        System.out.print("Guess a number between 1-100 ");
        do{
            System.out.print("\nEnter a guess: ");
            guess=sc.nextInt();
            if(guess<randomNum){
                System.out.print("Number too short. ");
            System.out.print("Try again!");}
            else if(guess>randomNum){
                System.out.print("Number too long. ");
                System.out.print("Try again!");}
            attempts++;
        }while(guess!=randomNum);
        System.out.println("\nYou have won ");
        System.out.print("You took "+attempts+" attempts to guess the number.");
    }
}
