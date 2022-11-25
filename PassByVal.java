// Pass by value
// copy of the variable is passed not the variable itself.
// Java always passed variables to method parameters by value and never by reference
public class PassByVal {  
    static void increment(int p){
        p = p+1;
        System.out.println("Value of p :"+p);
    }


    public static void main(String[] args){
        int x = 5;
        System.out.println("Before increment, x is :"+x);
        increment(x);
        System.out.println("After increment, x is: "+x);
    }
    
}

class PassByRef{
    static int increment(int p){
        p = p+1;
        System.out.println("Value of p :"+p);
        return p;
    }


    public static void main(String[] args){
        int x = 5;
        System.out.println("Before increment, x is :"+x);
        x = increment(x);
        System.out.println("After increment, x is: "+x);
    }
}



class PassByStri{
    static String func(String s){
        String x = s;
        System.out.println(x); 
        return x;

    }

    
    public static void main(String[] args) {
        String x = "a";
    //    x = "c";
        String y = x;
        // String z = "b";
        System.out.println(x);
        System.out.println(y);
        x = func("b");
        System.out.println(x);
        System.out.println(y);

        

    }
}