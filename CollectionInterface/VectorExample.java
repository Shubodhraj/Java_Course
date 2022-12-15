package CollectionInterface;
import java.util.*;
//import java.lang.ProcessBuilder.Redirect.Type;
//import java.lang.reflect.Field;  
public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<Integer>(10);
        v1.addElement(1);
        v1.addElement(2);
        v1.addElement(3);
        v1.addElement(4);
        v1.addElement(5);
        // v1.addElement("ac");
        v1.addElement(null);
        System.out.println(v1.size());
        System.out.println(v1.elementAt(1));
        System.out.println((v1.elementAt(1)));
        // v1.removeElement("ac");
        // v1.removeElementAt(0);
        // v1.removeAllElements();
        // v1.firstElement();
        // v1.lastElement();
        //int a = 5;
        //String s = "Hello world how are you ";
        //v1.insertElementAt(a, 5);
        //different constructor that can be used to initialize a vector:
        // Vector v2 = new Vector(int size);
        // Vector v3 = new Vector(int size, int increment);
        // Vector v4 = new Vector(Collection c);
    System.out.println(v1);
    for (int i =0; i<=5; i++){
        System.out.println(v1.elementAt(i));
    }
    
    // Map
   Enumeration<Integer> e = v1.elements();
   while(e.hasMoreElements()){
    Integer I = (Integer)e.nextElement();
    System.out.println(I);

   }

    System.out.println(v1.get(1));
    

    }
}
