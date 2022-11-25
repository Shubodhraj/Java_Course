package classes;

public abstract class SimpleAbstraction {
    double length =5.5;
    double breath = 4.5;
    double radius = 1.5;

SimpleAbstraction(double l, double b, double r){
    this.length = l;
    this.breath = b;
    this.radius = r;
}
public abstract void areaRect();
public abstract void areaCircle();
public abstract void areaSquare();

public void showInfo(){
    System.out.println("Hello I am non-abstract method of this abstract class.");
}

}

class Rect extends SimpleAbstraction{

Rect(double l, double b, double r){
    super(l, b, r);
}
public void areaRect(){
    double area = length * breath;
    System.out.println("Area of Rectangle is :"+area);
}
public void areaCircle(){
    double area = 3.1415 * radius;
    System.out.println("Area of Circle is :"+area);
}
public void areaSquare(){
    double area = length * breath;
    System.out.println("Area of Square is :"+area);
}
  
}


class Main1{
    public static void main(String[] args) {
        Rect r = new Rect(1,2,3);
        r.areaCircle();
        r.areaRect();
        r.areaSquare();
    }
}