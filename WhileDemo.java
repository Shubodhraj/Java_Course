import java.util.*;
class WhileDemo {
    public static void main(String[] args) {
        List <String> myList = new ArrayList<>();
        
        myList.add("Apple");
        myList.add("Ball");
        myList.add("Cat");
        myList.add("Dog");
        myList.add("Elephant");

        int i = 0;

        while(i<myList.size()){
            System.out.println(myList.get(i));
            i++;   //remove this statement and check how loop responses!
        }
    }
    
}
//write a program of infinite while loop!!