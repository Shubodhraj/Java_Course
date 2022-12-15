package CollectionInterface;
import java.util.*;


public class ArrayListDemo {
    public static void main(String[] args) {
        List l1 = new ArrayList();
        l1.add("a");
        l1.add("b");
        l1.add("a");
        l1.add("b");
        l1.add(1);
        l1.add(null);
    System.out.println(l1);
    l1.remove("a");
    System.out.println(l1);
    l1.removeAll(l1);
    System.out.println(l1);
    List l2 = new ArrayList<>();
    l2.add("a");
    l2.add("b");
    l2.add("c");
    l2.add("d"); 
    // char[] charArray = {'a','b','b','c','d'};
    l1.addAll(l2);
    System.out.println(l1);
    System.out.println(l1.indexOf("e"));

    Iterator itr = l1.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }
        
    }
    
}
