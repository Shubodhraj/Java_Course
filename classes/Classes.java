package classes;

public class Classes {
    void printInfo(String name, int roll, String add, int cntct, String fclty){
        System.out.println("The name of student is: "+name);
        System.out.println("The roll number of student is: "+roll);
        System.out.println("The address of the student is: "+add);
        System.out.println("The contact number of student is: "+cntct);
        System.out.println("The faculty of the student is: "+fclty);
    }

    public static void main(String[] args) {
        Classes cl = new Classes();
        cl.printInfo("Ram", 23, "Kathmandu", 9841984, "Computer");
        Classes cl1 = new Classes();
        cl1.printInfo("RamHri", 13, "Lalitpur", 9123546, "Computer");
        ClassExample ce = new ClassExample();
        ce.displayInfo("Ram", "Ktm",11);

    }

    
}
