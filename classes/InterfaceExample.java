package classes;

interface InterfaceExample {
    double length = 5;

    void calcArea();
    void showArea();
}

class TestInterface implements InterfaceExample{
   public void calcArea(){
        double area = length * length;
        System.out.println("The area of square is: "+area);
    }
    public void showArea(){
        double area = 3.1415 * length;
        System.out.println("The area of a circle is: "+area);
    }
public static void main(String[] args) {
    TestInterface ti = new TestInterface();
    ti.calcArea();
    ti.showArea();
}

}