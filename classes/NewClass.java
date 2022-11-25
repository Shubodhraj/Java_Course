package classes;

import java.util.Scanner;

public class NewClass {
  int roll;
    String add;
    String name;

    void displayMyInfo() {
        System.out.println("The name of the student is: " + this.name);
        System.out.println("The address of the student is: " + this.add);
        System.out.println("The roll of the student is: " + this.roll);
    }

    void displayname(){
        System.out.println("I am Newclass");

    }

}

class A{

    // void displayname(){
    //     System.out.println("My name is hari");
    // }
    public static void main(String[] args) {
        A a = new A();
        NewClass nc = new NewClass();
        System.out.println("Enter your details: ");
        Scanner sc = new Scanner(System.in);
        String na = sc.nextLine();
        nc.name = na;
        System.out.println("Enter your address: ");
        String ad = sc.nextLine();
        nc.add = ad;
        System.out.println("Enter your roll: ");
        int rol = sc.nextInt();
        nc.roll = rol;

        nc.displayMyInfo();

        // nc.displayname();
        nc.displayname();

    }
}