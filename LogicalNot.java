
  
class Logical {
    public static void main(String[] args)
    {
        // initializing variables
        int a = 10, b = 1;
  
        // Displaying a, b, c
        System.out.println("Var1 = " + a);
        System.out.println("Var2 = " + b);
  
        // Using logical NOT operator
        System.out.println("!(a < b) = " + !(a < b));
        System.out.println("!(a > b) = " + !(a > b));
    }
}

// Syntax : Logical ‘NOT’ Operator (!)
// Unlike the previous two, this is a unary operator and returns true when the condition under consideration is not satisfied or is a false condition. 
// Basically, if the condition is false, the operation returns true and when the condition is true, the operation returns false. 