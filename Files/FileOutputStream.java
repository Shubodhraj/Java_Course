package Files;

import java.io.FileOutputStream;

class FileOutStream {

    public static void main(String[] args) {
        
        String data = "This is a line of text inside the file.";

        try {
            FileOutputStream output = new FileOutputStream("output1.txt");

            byte[] array = data.getBytes();

            // Writes byte to the file
            output.write(array);

            //data.flush();
            output.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }
    }
    
}


