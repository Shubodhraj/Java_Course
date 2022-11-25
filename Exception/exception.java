package Exception;

class ExceptionHandling {

    static void func1() {
        int x = 5;
        int y = 0;

        float z = x / y;
        System.out.println("Z: "+z);

        
    }

    public static void main(String[] args) {
        // try {
        //     func1();
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        // finally{
        //     System.out.println("I am done");
        // }
        func1();
        System.out.println("We handled exception well");
        
    }

}

class ExceptionHandling2 {

    static void func1() {
        int x = 5;
        int y = 0;
        try{
        float z = x / y;
        System.out.println(z);
        }
        catch(Exception e){
            System.out.println(e);
        }
       
    }
  

    public static void main(String[] args) {
        
        func1();

        System.out.println("We handled exception well");
    }

}

class ExceptionHandling3 {

    static void func1() {
        int x = 5;
        int y = 0;
        try{
            if(y == 0){
                throw new ArithmeticException("Cannot divide by 0");
            }
        float z = x / y;
        System.out.println(z);
        }
        catch(Exception e){
            System.out.println(e);
        }
       
    }
   

    public static void main(String[] args) {
        
        func1();

        System.out.println("We handled exception well");
    }

}
// Now using finally