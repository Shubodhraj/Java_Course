package ExmPrep;

//Program to set Min_priority and Max_priority
//you dont have to create all three objects. 
//you can create any one objects and apply these methods.
//Dont use the same class name, object name and method name.  
class ThreadPriorityExample extends Thread   
{  
  
public void run()  
{  

System.out.println("Inside the run() method");  
}  
  

public static void main(String argvs[])  
{  
// Creating threads with the help of ThreadPriorityExample class  
ThreadPriorityExample th1 = new ThreadPriorityExample();  
ThreadPriorityExample th2 = new ThreadPriorityExample();  
ThreadPriorityExample th3 = new ThreadPriorityExample(); 
// th1.MIN_PRIORITY;
// th2.MAX_PRIORITY;
th3.setPriority(7);
System.out.println(th3.getPriority());

System.out.println();
System.out.println((th1.MIN_PRIORITY)); 
System.out.println(th2.MAX_PRIORITY);
th1.start();
th2.start();
th3.start();
  
}  
}  

