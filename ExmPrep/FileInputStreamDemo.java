package ExmPrep;

//FileInputStream program. This program can be used to show exception handling 
//or for importing another package using import.*; syntax. 
import java.io.*;
public class FileInputStreamDemo {
    public static void main(String[] args) {
        
    
    byte[] array = new byte[15];

    try {
        // File f0 = new File("MyFile");
      FileInputStream input = new FileInputStream("file1.txt");

      System.out.println("Available bytes in the file: " + input.available());

      // Read byte from the input stream
      input.read(array);
    
      // Convert byte array into string
      String data = new String(array);
      System.out.println(data);
      // Close the input stream
      input.close();
    }
    catch (Exception e) {
      e.getStackTrace();
    }
  }
}




