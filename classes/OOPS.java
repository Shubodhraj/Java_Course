package classes;

class Pen {
    String color;
    String type;

    public void write(){
        System.out.println(this.type+" "+"Pen"+ " is"+" Writing Something in "+this.color+" colour");
    }
    
}

public class OOPS{
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "Blue";
        p1.type = "Gel";
        
        p1.write();
    }
}

//non-parameterized constructor, parameterized constructor.