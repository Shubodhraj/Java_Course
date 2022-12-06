package Files;
// import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;
class FileStream{
public static void main(String args[]) {

    byte[] array = new byte[10];

    try {
      InputStream input = new FileInputStream("file1.txt");

      System.out.println("Available bytes in the file: " + input.available());

      // Read byte from the input stream
      input.read(array);
      System.out.println(array);
      System.out.println("Data read from the file: ");
      for(int i =0; i<=10; i++){
        System.out.println(array[i]);
      }
      // Convert byte array into string
      String data = new String(array);
      System.out.println(data);
      // Close the input stream
      input.close();
    } catch (Exception e) {
      e.getStackTrace();
    }
  }
}





