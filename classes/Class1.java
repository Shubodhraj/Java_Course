package classes;

public class Class1 {
    String name;
    String address;
    int roll;

Class1(String nam, String add, int rol){
    this.name = nam;
    this.address = add;
    this.roll = rol;

}

void disMyInfo(){
    System.out.println("Name:"+this.name);
}

    public static void main(String[] args) {
        Class1  c1 = new Class1("Ram", "Nepal", 123);
        
        c1.disMyInfo();



    }
    
    }

