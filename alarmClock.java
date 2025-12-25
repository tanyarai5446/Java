import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.lang.Thread;
import java.io.*;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
public class alarmClock {
    public static void main(String[]args)
    {
        //java alarm clock
        Scanner sc=new Scanner(System.in);
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmtime=null;
        String filepath="Nebula.wav";

        while(alarmtime==null)
        {
            try {
                System.out.print("Enter an alarm time (HH:MM:SS) :  ");
                String inTime = sc.nextLine();
                alarmtime = LocalTime.parse(inTime, formatter);         // for time set for future
                System.out.println("Alarm set for " + alarmtime);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid Format. Please use HH:MM:SS ");
            }
         }
        Clock alarmclock=new Clock(alarmtime,filepath,sc);
        Thread alarmthread=new Thread(alarmclock);
        alarmthread.start();
        //sc.close not used becoz thread class still needs it
    }
}
class Clock implements Runnable{
    private final String filepath;
    private final LocalTime alarmtime;
    private final Scanner sc;           // to access scanner in playsound
    Clock(LocalTime alarmtime,String filepath,Scanner sc)
    {
         this.alarmtime=alarmtime;
         this.filepath=filepath;
         this.sc=sc;
    }
    @Override
    public void run()
    {
        LocalTime now = LocalTime.now();         //for present time
        while(LocalTime.now().isBefore(alarmtime))
        {
            try{
                Thread.sleep(1000);
                int hours =now.getHour();
                int minutes = now.getMinute();
                int seconds =LocalTime.now().getSecond();//if used only now.get... the seconds  change is not visible in o/p but the result is shown
                // so used LocalTime.now().get....  to see the seconds changing continusly like timer in o/p
                System.out.printf("\r%02d:%02d:%02d",hours,minutes,seconds);//used /r carriage return changes o/p on place rather than taking new line
            }
            catch(InterruptedException e)
            {
                System.out.println("Thread was interrupted");
            }
        }
        System.out.println("\n*Alarm Noises*");
        playSound(filepath);
    }
    private void playSound(String filepath)
    {
        File audiofile=new File(filepath);

        try(AudioInputStream audioStream =AudioSystem.getAudioInputStream(audiofile)){
            Clip clip =AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            System.out.println("Please *Enter* to stop alarm :  ");
            sc.nextLine();
            clip.stop();
            sc.close();
        }
        catch(UnsupportedAudioFileException e)
        {
            System.out.println("audio file format not supported!");
        }
        catch(LineUnavailableException e)
        {
            System.out.println("Audio is unavialable!");
        }
        catch(IOException e)
        {
            System.out.println("Error reading audio file!");
        }
        catch(IllegalStateException e)
        {
            System.out.println("audio interrupted!");
        }
    }
}
