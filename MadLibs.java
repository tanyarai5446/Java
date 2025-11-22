import java.util.Scanner;
//mad libs game
public class MadLibs {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;
        System.out.print("enter an adjective(description): ");
        adjective1 = sc.nextLine();
        System.out.print("enter a noun(person): ");
        noun1 = sc.nextLine();
        System.out.print("enter an adjective(description): ");
        adjective2 = sc.nextLine();
        System.out.print("enter a verb (action): ");
        verb1 = sc.nextLine();
        System.out.print("enter an adjective(description): ");
        adjective3 = sc.nextLine();

        System.out.println("\nToday I went to a "+ adjective1 +" zoo");
        System.out.println("I met famous "+ noun1+" in person");
        System.out.println("He was "+adjective2+" and "+verb1+" screaming");
        System.out.println("I was "+adjective3);

        sc.close();
    }
}
