import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class hangmanGame {
    public static void main(String[]args)
    {
         ArrayList<String> words=new ArrayList<>();
         String filepath="hangmanwords";
         try(BufferedReader file=new BufferedReader(new FileReader(filepath))){
             String line;
             while((line=file.readLine())!=null)
             {
                 words.add(line);
             }
         } catch (FileNotFoundException e) {
             System.out.println("could not locate file location");
         } catch (IOException e) {
             System.out.println("Something went wrong");
         } catch(IllegalArgumentException e)
         {
             System.out.print("Something went wrong");
         }
         Random rd=new Random();
         String word=words.get(rd.nextInt(words.size()));
         System.out.println(word);
         int wrongguess=0;
         //hangman game of guessing correct letters of word
         Scanner sc = new Scanner(System.in);
         ArrayList<Character> state= new ArrayList<>();
         for(int i=0;i<word.length();i++)
         {
             state.add('_');
         }
         System.out.println("**********************************");
         System.out.println("Welcome to java hangman game");
         System.out.println("**********************************");

         while(wrongguess<6)
         {
             System.out.println(hangman(wrongguess));
             System.out.print("Word: ");
             for(char c:state)
             {
                 System.out.print(c+" ");
             }
             System.out.println();
             System.out.print("Choose a letter : ");
             char guess=sc.next().charAt(0);
             if(word.indexOf(guess)>=0) {
                 System.out.println("Correct guess!");
                 for (int i = 0; i < word.length(); i++) {
                     if (word.charAt(i) == guess) {
                         state.set(i, guess);
                     }
                     }
                 if(!state.contains('_')){
                     System.out.println(hangman(wrongguess));
                     System.out.println("You win!");
                     System.out.print("The word was "+word);
                     break;
                 }
             }else{
                 wrongguess++;
                 System.out.println("Wrong guess");
             }
         }
         if(wrongguess>=6)
         {
             System.out.println(hangman(wrongguess));
             System.out.println("Game over!");
             System.out.print("The word was "+word);
         }
    }
    static String hangman(int wrongguess)
    {
        return switch(wrongguess)
        {
            case 0 -> """
                               0
                    
                    
                    """;
            case 1 -> """
                               0
                                |
                    
                    """;
            case 2 -> """
                               0
                              / |
                     
                    """;
            case 3 -> """
                                0
                              / | \\
                    
                    """;
            case 4 -> """
                                0
                              / | \\
                               / 
                    """;
            case 5 -> """
                                0
                              / | \\
                               / \\
                    """;
            default ->"""
                                0
                              / | \\
                               / \\
                    """;
        };
    }
}
