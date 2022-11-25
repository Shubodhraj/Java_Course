package classes;

class Aa {

    void show(){

        System.out.println("Class A");
    }
    
}

class Bb extends Aa{

    void show(int a){
        System.out.println("Class B");
    }
    
    void show(){
        System.out.println("Class C");
    }
}

class Cc extends Bb{

    void show(){
        System.out.println("Class C");
    }
    
}

class D{
    public static void main(String[] args) {
        Aa a = new Aa();
        Bb b = new Bb();
        Cc c = new Cc();

        Aa aa = new Bb();
        
        Bb bb = new Cc();


        // a.show();
        // Aa a = new Bb(); //Java uses the principle of ‘a superclass reference variable can refer to a subclass object’ When an overridden method is called through a superclass reference,
        //  Java determines which version(superclass/subclasses) of that method is to be executed based upon the type of the object being referred to at the time the call occurs. Thus, this determination is made at run time.
        // a.show();
        Aa ref;
        // ref = a;
        // ref.show();
        // ref = b;
        // ref.show();
        ref =c;
        ref.show();
        // c.show();
        // ref = b;
        // ref.show(); //even though the ref variable is refering to class A, it will show the method of class B. Because we have passed the object of Class B to ref.
        // Aa c = new Cc();//Java uses the principle of ‘a superclass reference variable can refer to a subclass object’ 
        // c.show();
        bb.show();
    
    
    }
}





// check below for another code example.

// class A
// { 
//     void m1() 
//     { 
//         System.out.println("Inside A's m1 method"); 
//     } 
// } 
  
// class B extends A 
// { 
//     // overriding m1() 
//     void m1() 
//     { 
//         System.out.println("Inside B's m1 method"); 
//     } 
// } 
  
// class C extends A 
// { 
//     // overriding m1() 
//     void m1() 
//     { 
//         System.out.println("Inside C's m1 method"); 
//     } 
// } 
  
// // Driver class 
// class Dispatch 
// { 
//     public static void main(String args[]) 
//     { 
//         // object of type A 
//         A a = new A(); 
  
//         // object of type B 
//         B b = new B(); 
  
//         // object of type C 
//         C c = new C(); 
  
//         // obtain a reference of type A 
//         A ref; 
          
//         // ref refers to an A object 
//         ref = a; 
  
//         // calling A's version of m1() 
//         ref.m1(); 
  
//         // now ref refers to a B object 
//         ref = b; 
  
//         // calling B's version of m1() 
//         ref.m1(); 
  
//         // now ref refers to a C object 
//         ref = c; 
  
//         // calling C's version of m1() 
//         ref.m1(); 
//     } 
// } 

