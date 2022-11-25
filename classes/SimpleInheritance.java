package classes;

class Employees {

    String name, address, faculty;

    public void showDetails(){
        System.out.println("The name of the employee is: "+name);
        System.out.println("The address of the employee is: "+address);
        System.out.println("The faculty of the employee is: "+faculty);

    }
    // Function that shows the method overriding in java
    public void methodOverride(){                                
        System.out.println("Hello! I belong to class Employees");
    }

    
}

class Teacher extends Employees{
double phone; double account;


void teacherDetail(){
    System.out.println("The phone number of the teacher is: "+phone);
    System.out.println("The account number of the teaher is: "+account);
}
public void methodOverride(){
    System.out.println("Hello! I belong to class Teacher");
}


}

 class Students{
    double phone; double roll;

    void showStudent(){
        System.out.println("The Phone number of the studetn is: "+phone);
        System.out.println("The roll number of the student is "+roll);
    }
}

class RunProgram{
    public static void main(String[] args) {
        Teacher t = new Teacher();
        Students s = new Students();
        t.phone = 1234;
        t.account = 1234;
        t.name = ("ram");
        t.faculty = "Computer";
        t.teacherDetail();
        t.showDetails();
        s.phone = 1234;
        s.roll = 1245;
        s.showStudent();
        t.methodOverride();
        
    }
}