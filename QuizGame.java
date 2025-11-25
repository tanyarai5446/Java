import java.util.Scanner;
public class QuizGame {
    public static void main(String[] args){
        //java quiz game
        //questions array
        String[] ques={"(1)What is the use of ellipsis in java?",
                "(2)What is the use of Thread.sleep  in java?",
                "(3)What class do you have to import for taking input in java?",
                "(4)By default how many statments can be executed without curly braces in conditional statements?",
                "(5)What does a Random class do in java?"};
        //options
        String[][] options={{"1.Nothing","2.To represent ommitted code in comments","3.Indicate variable length args in a method","4.Specify multiple inheritence in class declaration"},
                            {"1.Pauses currently exe. code for some specified time","2.Handle database connection","3.Create and manage multiple threads of execution","4.Compile Java source code into bytecode"},
                            {"1.java.util,Scanner","2.java.util.scanner","3.java.util.Random","4.java.util.Araays"},
                            {"1.0","2.3","3.4","4.1"},
                            {"1. Generates random numbers of various types (int, float, double, boolean, etc.)","2. Randomly selects classes to load at runtime","3. Randomly shuffles the order of threads in execution","4. Randomly deletes unused objects from memory"}};
        //answers
        int[] ans={2,1,1,4,1};
        int score=0;
        int guess;

        Scanner sc = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Welcome to Quiz game!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        for(int i=0;i<ques.length;i++){
            System.out.println(ques[i]);
            for(String opt:options[i])
            {
                System.out.println(opt);
            }
            System.out.print("Enter your guess: ");
            guess=sc.nextInt();
            if(guess==ans[i]){
                System.out.println("CORRECT");
                score++;}
            else
                System.out.println("WRONG");
        }
        System.out.println("Your final score is "+score+" out of "+ques.length);
        sc.close();
    }
}
