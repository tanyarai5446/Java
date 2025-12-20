import java.io.*;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.util.Scanner;
public class musicplayer {
    public static void main(String[]args)
    {
        //How to play audio with java (MP3->Lossy,music ditsribution &streaming,compresses audio to smaller size and low quality but portable
                                                           // wav ->uncompressed,,,proffessional audio editing,,stores files in large size with full quality
                                                           //au -> uncompressed,,, rarely used developed by sun microsystem for unix system
                                                           //aiff ->uncompressed,,,developed by apple used in mac environment for professional audio(like wav)
        //copy the file name from clicking right on file in src and then click on copy file path and then name
         String filepath="Claim To Fame - The Grey Room _ Clark Sims.wav";
         File file=new File(filepath);//assigning filepath to file constructor
        try(Scanner sc = new Scanner(System.in);//we can use try with resources in modern java
            AudioInputStream audiostream=AudioSystem.getAudioInputStream(file))
        {

            //get some contro;s to pause ,play
           Clip clip=AudioSystem.getClip();
           clip.open(audiostream);//player (clip) opens audio

            // we will take input from iser to play and pause
            String response="";
            while(!response.equals("Q"))
            {
                System.out.println("P=plau");
                System.out.println("S=stop");
                System.out.println("R=reset");
                System.out.println("Q=quit");
                System.out.println("Enter you choice");
                response=sc.next().toUpperCase();
                switch(response)
                {
                    case "P"->clip.start();
                    case "S"->clip.stop();
                    case "R"->clip.setMicrosecondPosition(0);
                    case "Q"->clip.close();
                    default->System.out.print("invalid input");
                }
        }
        }
        catch(FileNotFoundException e)
        {
            System.out.print("Could not locate the file location");
        }
        catch(UnsupportedAudioFileException e){//for audio stream
            // if used mp3 then this exception
            System.out.print("Audio file not supported");
        }
        catch(LineUnavailableException e)//for clip
        {
            System.out.print("Unable to access audio resource");
        }
        catch(IOException e)
        {
            System.out.print("Something went wrong");
        }
        finally{
            //optional
            System.out.print("Bye!");
        }
    }
}
