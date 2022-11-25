package classes;

// class Shape {
    
//     double areaRect(){
//         double l = 5.5;
//         double b = 5.5;
//         double area = l * b;
//         System.out.println("Area of rectangle is: "+area);
//         return area;
//     }
//     void areaSquare(){
//         double l = 5.5;
//         double b = 5.5;
//         double area = l * b;
//         System.out.println("Area of square is: "+area);
    
//     }
//     void parentClass(){
//         System.out.println("I am parent class");
//     }

// }

// class Rectangle extends Shape{
//     double height = 5.5;
   
//     void calcVolume(double area){
//         double volume = height * area;
//         System.out.println("Volume of rectangel is: "+volume);
//     }

//     void showI(){
//         System.out.println("Hi I am class Rectangle");
//     }

// }
// class Circle{
//     void printCircle(){
//         System.out.println("I am circle");
//     }
// }
// class Finale{
//     public static void main(String[] args) {
//         Rectangle r = new Rectangle();
//         r.showI();
//         r.parentClass();
//         double aa = r.areaRect();
//         r.calcVolume(aa);
//         Circle c  = new Circle();
//         c.printCircle();
    

//     }
// }



class Parent{
    int a =5;
    String s = "Hello";
    void showParent(){
        System.out.println(s+" "+"value of a is:"+a);
    }
    void meth(){
        System.out.println("I am parent class");
    }
}

class Child extends Parent{
    void meth(){
        System.out.println("I am child class");
    }
}

class Finally{
    public static void main(String[] args) {
        Parent p = new Parent();
        p.showParent();
        p.meth();
        Child c = new Child();
        c.meth();
        c.showParent();
    }
}