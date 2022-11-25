package classes;

class MethodOverLoading1 {
   

    float method_overload(float a, float b){
        float c = a*b;
        //System.out.println("The are of rectangle is: "+c);
        return(c);
    }

    double method_overload(float a){
        
        return 3.1415f*(a*a);
    }
    
    double method_overload(double a, double b){
        //System.out.println("triangle");
        double c = 0.5*(a/b);
        return c;
    }
        
    String method_overload(){
        //System.out.println("Hello");
        return "Hello";
    }
        
public static void main(String[] args) {
    MethodOverLoading1 ml = new MethodOverLoading1();
    System.out.println("The area of rectangle is: "+ml.method_overload(5f, 5f));
    System.out.println("The area of the circle is: "+ml.method_overload(7.5f));
    System.out.println("The area of the triangle is: "+ml.method_overload(4d, 4d));
    System.out.println("The method with no parameter returns: "+ml.method_overload());

}

}

    


// By default, float numbers are treated as double in Java. so assign f to denote it is float.
// The first step to creating a dictionary in Java is to choose a class that implements a “key-value pair” interface; a few examples include HashTables, HashMap, and LinkedHashMap.