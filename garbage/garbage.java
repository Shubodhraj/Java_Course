/* Java program to demonstrate that
objects created inside a method will becomes
eligible for gc after method execution terminate */

class Test {

    // to store object name
    String obj_name;

    public Test(String obj_name) {
        this.obj_name = obj_name;
    }

    static void show() {
        // object t1 inside method becomes unreachable when show() removed
        Test t1 = new Test("t1");
        display();

    }

    static void display() {
        // object t2 inside method becomes unreachable when display() removed
        Test t2 = new Test("t2");
    }

    // Driver method
    public static void main(String args[]) {
        // calling show()
        show();

        // calling garbage collector
        System.gc();
    }

    @Override
    /*
     * Overriding finalize method to check which object
     * is garbage collected
     */
    protected void finalize() throws Throwable {
        // will print name of object
        System.out.println(this.obj_name + " successfully garbage collected");
    }
}


// public class JavaExample{   
//     public static void main(String args[]){  
//         /* Here we are intentionally assigning a null 
//          * value to a reference so that the object becomes
//          * non reachable
//          */
// 	JavaExample obj=new JavaExample();  
// 	obj=null;  
		
//         /* Here we are intentionally assigning reference a 
//          * to the another reference b to make the object referenced
//          * by b unusable.
//          */
// 	JavaExample a = new JavaExample();
// 	JavaExample b = new JavaExample();
// 	b = a;
// 	System.gc();  
//    }  
//    protected void finalize() throws Throwable
//    {
//         System.out.println("Garbage collection is performed by JVM");
//    }
// }