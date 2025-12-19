import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
public class WriteFiles {
    public static void main(String[]args)
    {
        //writing files in java to store ,share and reuse in future
        //writing statement inside () in try block as per modern java
        String textcontent= """
                                        roses are red
                                        violets are blue
                                        booty booty booty
                                        Rockin ' Everywhere!   
                                                                                """;
        // by default the file gets saved in src folder
        //you can define location of file by copying the location from properties of that folder and paste before text.txt (usee//)
        try(FileWriter writer=new FileWriter("text.txt")){
            writer.write(textcontent);
            System.out.println("file has been written");
        }
        catch(FileNotFoundException e){
            System.out.println("could not locate file location");
        }
        catch(IOException e){
            System.out.println("could not write file");
        }
    }
}
