import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
public class ReadFiles {
    public static void main(String[]args) {
        //BufferedReader=best fo reading txt files         👈
        //FileInputStream=best for binary files(images,audio files)
        //RandomAccessFile=best for read/write specific portions of large files
        try (BufferedReader reader = new BufferedReader(new FileReader("text.txt"))) {
            System.out.println("file exists");
            String line;
            while((line=reader.readLine()) !=null){//read every line through reader ans assign to line until line!=null
             System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("could not locate file location");
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }
    }
}
