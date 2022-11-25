package classes;

public class Student {
    String name ;
    int rollno ;

    Student(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Durga", 25);
        Student s2 = new Student("Ram", 55);
        System.out.println(s1.name);
        System.out.println(s1.rollno);
        System.out.println(s2.name);
        System.out.println(s2.rollno);
    }
    
}
//parameterized constructor

//copy constructors