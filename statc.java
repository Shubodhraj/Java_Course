class Statc {
    static int a =10; //static variable or class variable
    int c = 30; // instance variable
    public static void main(String[] args) {
        int b = 20; //local variable
        Statc obj = new Statc();
        System.out.println(a); // or System.out.println(Statc.a);
        System.out.println(obj.c);
        System.out.println(b);
        obj.sum();
        obj.sum();
    }
    
    void sum(){
        int d = 8;
        System.out.println(d+" "+a);
        ++d; ++a;
        System.out.println(d+" "+a);
    }
}

