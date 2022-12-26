package classes;

public class VariablesExample {

   static String college = "Whitefiled";
    int phn;
    String name;
    int roll;

    void functionOne(){
       String faculty = "computer";
        System.out.println(faculty);
        System.out.println(name);
        System.out.println(phn);
        System.out.println(roll);

    }

void functionTwo(){
    
}

VariablesExample(int ph, String n, int r){
    this.name = n;
    this.phn = ph;
    this.roll = r;

    System.out.println("I am running");
}

VariablesExample(){
    System.out.println("I am non-parameterized constructor");

}

    public static void main(String[] args) {
        VariablesExample ob1 = new VariablesExample(123456, "Nitesh", 123);
        // ob1.name = "Nitesh";
        // ob1.phn = 123456;
        // ob1.roll = 1;
        VariablesExample ob2 = new VariablesExample();
        ob2.functionOne();
        ob1.functionOne();
        System.out.println(VariablesExample.college);
    }
}