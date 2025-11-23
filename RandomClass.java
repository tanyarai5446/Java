import java.util.Random;
public class RandomClass {
    public static void main(String[]args){
        Random rd=new Random();
        Boolean isHead=rd.nextBoolean();
        System.out.println("Commentator:");
        System.out.println("The match is going to take palce between two teams of 11.");
        System.out.println("Now lets see who will be Batting first:");
        System.out.println("Empire flips the coin:....\nEveryone is curious");
        System.out.println("Team A chooses head.");
        if(isHead==true){
            System.out.print("WE GOT HEAD..");
            System.out.print("Team A wins and chooses batting");}
        else{
            System.out.print("WE GOT TAIL..");
            System.out.print("Team B wins and chooses Balling");}
        System.out.print("\nThe match begins now!...");

    }
}
