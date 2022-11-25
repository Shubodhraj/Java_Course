package classes;

class MethodOverLoad {

    int cube(int x) {
        return x * x * x;
    }

    double cube(double x) {
        return x * x * x;
    }

    float cube(float x) {
        return x * x * x;
    }

    public static void main(String[] args) {
        MethodOverLoad myMultiplication = new MethodOverLoad();
        System.out.println("The cube of 5 is " + myMultiplication.cube(5));
        System.out.println("The cube of 0.5 is " + myMultiplication.cube(0.5));
        System.out.println("The cube of 5.0 is " + myMultiplication.cube(5.0));
        
    }

}

//now create a method having void return type with different parameters.
//use list index to access the value and insert into the method parameters.