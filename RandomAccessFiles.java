import java.io.*;
public class RandomAccessFiles {
    public static void main(String[]args) {
        //BufferedReader=best fo reading txt files
        //FileInputStream=best for binary files(images,audio files)
        //RandomAccessFiles=best for read/write specific portions of large files            👈

        try {   //open file in read write mode
                RandomAccessFile raf = new RandomAccessFile("text.txt","rw");

                 System.out.println("file exists");
             //read  first 5 char
            byte[] buffer=new byte[5];
            raf.read(buffer);
            System.out.println("First 5 chars: "+new String(buffer));
            //move pointer to the end of the file
            raf.seek(raf.length());
            //append new text
            raf.writeBytes("Welcome to JAVA");
            //reset pointer to start 0
            raf.seek(0);
            //read entire file again
            System.out.println("Re reading the file: ");
            String line;
            while((line=raf.readLine()) !=null){//read every line through reader ans assign to line until line!=null
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("could not locate file location");
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }
    }
}
