package Files;

import java.util.Collection;
import java.util.List;

public class constructor {
    static String address = "Ktm";
    int roll;
    float weight;
    // constructor(){
    //     System.out.println("This is an example of constructor overloading");
    // }

    // constructor(int r, float w){
    //     this.roll = r;
    //     this.weight = w;
    //     System.out.println(roll+" "+weight);
    //     System.out.println("hello i am constructor");

    // }


    //method overloading
    void add(){
        int a = 5;
        int b =5;
        int sum  = a+b;
        System.out.println(sum);
    }

    void add(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }

    void add(float a, int b){
        float sum = a+b;
        System.out.println(sum);
    }
    int add(int a){
        return a;
    }
    

    public static void main(String[] args) {
        // constructor c = new constructor(37, 80);
        constructor c1 = new constructor();
        String name = "ram";
        // System.out.println("name: "+name);
        // System.out.println(c.roll);
        // System.out.println(address);
        c1.add();
        c1.add(10.5f, 5);
       Collection
       
            }
    
}
