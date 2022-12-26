package CollectionInterface;

import java.util.Set;
import java.util.*;
//set is used if we need to store only unique value in some order. But HashSet maintains the insertion order.
public class HashSetExample {
    public static void main(String[] args) {
        Set s = new HashSet<>();
        s.add("a");
        s.add("b");
        System.out.println(s);
    }
    
}
