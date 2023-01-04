package ExmPrep;

public class ExceptionHandlingDemo {
    static void func1(int x, int y) {
        // int x = 5;
        // int y = 0;
        try{
        float z = x / y;
        System.out.println(z);
        }
        catch(Exception e){
            System.out.println(e);
        }
       
    }
  

    String s = new String("Hello world");
    
    String s1 = "hellooo";

    public static void main(String[] args) {
        
        func1(5,0);

        System.out.println("We handled exception well");
    }
    
}



