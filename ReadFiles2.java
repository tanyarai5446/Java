import java.io.*;
public class ReadFiles2 {
    public static void main(String[]args) {
        //BufferedReader=best fo reading txt files
        //FileInputStream=best for binary files(images,audio files)       👈
        //RandomAccessFile=best for read/write specific portions of large files
        try (FileInputStream file = new FileInputStream("text.txt"))          //reads byte by byte
        {
                                                                                                                          // read() ->reads one byte at a time ..
                                                                                                                          // read(byte[] b)  -> reads multiple bytes into an array,,
                                                                                                                           // close()->closes stream and releases resources  used whn not written the FileInputStream nside try block
            System.out.println("file exists");
            //used read()
//            int bytesread;
//            while((bytesread=file.read()) !=-1){//assigne every byte to bytesread of text through read until byte=-1
//                //converts every byte to char
//                System.out.print((char) bytesread);
//            }
            //used read(byte[] b)
            byte[] buffer=new byte[8];//reads 8 bytes at a time
            int bytess;
            while((bytess=file.read(buffer))!=-1)//assign 8 bytes to bytess from buffer array of byte
            {
                String chunk=new String(buffer,0,bytess);//convert only valid portion of buffer into char     ,, read byte from buffer from starting index 0 and bytess is length i.e.how many bytes convrted to char
                                                                                           //we could have used String chunk = new String(buffer) but it will convert all byes to string which not needed
                System.out.print(chunk);
            }
        } catch (FileNotFoundException e) {
            System.out.println("could not locate file location");
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }
    }

}
