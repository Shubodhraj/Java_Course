class DefaultVarInit {
    int number;         // number will have default value: 0
    float ratio;        // default value: 0.0
    boolean success;    // default value: false
 
    String name;        // default: null
    Object obj;         // default: null
 
    public void print() {
        System.out.println("number = " + number);
        System.out.println("ratio = " + ratio);
        System.out.println("success = " + success);
        System.out.println("name = " + name);
        System.out.println("obj = " + obj);
    }
 
    public static void main(String[] args) {
        new DefaultVarInit().print();
    }
 
}