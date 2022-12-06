package Files;
import java.util.ArrayList;
import java.util.Scanner;

import java.io.Console;
public class ConsoleExmple {
 public static void main(String[] args) {
    Console c = System.console();
    System.out.println("Enter your name");
    String n = c.readLine();
    System.out.println("Hello "+n);
 }
   
}







class ClassExample{


    //display student info



public static void main(String[] args) {
        ClassExample ce = new ClassExample();
        // ce.displayInfo("ram", "KTN", 12);
        // ClassExample ce1 = new ClassExample();
        // ce1.displayInfo("shyam", "bhktpr", 10);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nepali font");
        String np = sc.nextLine();
        System.out.println(np);
        sc.close();
        ce.displayInfo("Ram", "ktm", 12);
}



void displayInfo(String name, String addr, int roll ){
    System.out.println("The name of the student is: "+name);
    System.out.println("The address of the student is: "+addr);
    System.out.println("The roll number of the student is: "+roll);


    int[] i = new int[10];

    ArrayList al = new ArrayList<>();
    al.add(1);
    al.add("a");
    al.add(1.2);
    System.out.println(al);
    i[0] = 1;
    i[1] = 2;
    // i[2] = "a";
    System.out.println(i[1]);


}


}























