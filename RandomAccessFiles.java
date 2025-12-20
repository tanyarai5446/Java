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
//rw mode
// 1. Read-only mode
//            RandomAccessFile rafRead = new RandomAccessFile("text.txt", "r");
//            System.out.println("Read-only mode: " + rafRead.readLine());
//            rafRead.close();

// 2. Read/Write mode
//            RandomAccessFile rafRW = new RandomAccessFile("text.txt", "rw");
//            rafRW.seek(rafRW.length()); // move pointer to end
//            rafRW.writeBytes("\nAppended in rw mode");
//            rafRW.close();

// 3. Read/Write with sync metadata ->used when data integrity is critical (databases or log) (saved data to disk and metadata)
//            RandomAccessFile rafRWS = new RandomAccessFile("text.txt", "rws");
//            rafRWS.seek(rafRWS.length());
//            rafRWS.writeBytes("\nAppended in rws mode");
//            rafRWS.close();

// 4. Read/Write with sync data only  -> used when data integrity (saved data to disk only not metadata)
//            RandomAccessFile rafRWD = new RandomAccessFile("text.txt", "rwd");
//            rafRWD.seek(rafRWD.length());
//            rafRWD.writeBytes("\nAppended in rwd mode");
//            rafRWD.close();
