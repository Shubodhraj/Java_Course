package Files;

import java.io.File;
import java.io.Console;

public class FirstFile {
    public static void main(String[] args) {
        File f = new File("/home/subodh/Public/Java/Files/file1.txt");
        System.out.println("File name :" + f.getName());
        System.out.println("Path: " + f.getPath());
       
    }
}

class ConsoleTest {
    public static void main(String[] args) {
        System.out.println("Console is: " + System.console());
    }
}
