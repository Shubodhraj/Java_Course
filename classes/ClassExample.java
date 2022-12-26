package classes;

import java.util.Dictionary;
import java.util.Hashtable;

import javax.naming.spi.DirObjectFactory;
import javax.sound.sampled.SourceDataLine;

public class ClassExample {

  void displayInfo(String name, String add, int roll) {
    
    System.out.println("The name of student is: "+name);
    System.out.println("He/she lives in: "+add);
    System.out.println("his/her roll number is: "+roll);

  }

  public static void main(String[] args) {
    
    ClassExample ce = new ClassExample();
    ce.displayInfo("Sunita", "Kathmandu", 1234);
    ce.displayInfo("Ayush", "Kathmandu", 12244);

  }
  Dictionary d = new Hashtable<>() {
  };
  
}

