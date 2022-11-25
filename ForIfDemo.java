import java.util.ArrayList;
import java.util.List;

class ForIfDemo {
    public static void main(String[] args) {
        List <String> list1 = new ArrayList<>();
        list1.add("Java");
        list1.add("SDA");
        list1.add("PAS");
        list1.add("Wbtech");
        
        for(int i = 0; i<list1.size(); i++){
            if (list1.get(i)=="Java"){
                System.out.println("Java is a platform independent language!!!");
            }
            System.out.println(list1.get(i));  //get(i)->It is used to fetch the element from the particular position of the list.
        }
        

    }
}
