package ExmPrep;

//method overloading example
public class methodOverloadingDemo {

    void add(int a, int b){
        int c = a+b;
    }
    
    int add(){
        int sum = 100;
        return sum;

    }

    int add(int a, int b, int c){
        int volume = a*b*c;
        return volume;
    }
    
    public static void main(String[] args) {
        methodOverloadingDemo mo = new methodOverloadingDemo();
        mo.add();
        mo.add(5,5);
        mo.add(5,5,5);
    }
}


