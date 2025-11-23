import java.util.Scanner;
public class substringMethod {
    public static void main(String[]args){
        //.substring=a method to extract a string from a string

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your email: ");
        String email = sc.nextLine();
        if(email.contains("@")) {
            String username = email.substring(0, email.indexOf("@"));
            System.out.print("\nYour username: " + username);
            String domain = email.substring(email.indexOf("@") + 1);
            System.out.print("\nyour domain : " + domain);
        }
        else
        {
            System.out.print("Email must contain @");
        }
        sc.close();
    }
}
