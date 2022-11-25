
  
public class ThreadPriorityExample extends Thread   
{  
  
// Method 1  
// Whenever the start() method is called by a thread  
// the run() method is invoked  
public void run()  
{  
// the print statement  
System.out.println("Inside the run() method");  
}  
  
// the main method  
public static void main(String argvs[])  
{  
// Creating threads with the help of ThreadPriorityExample class  
ThreadPriorityExample th1 = new ThreadPriorityExample();  
ThreadPriorityExample th2 = new ThreadPriorityExample();  
ThreadPriorityExample th3 = new ThreadPriorityExample();  
  
// We did not mention the priority of the thread.  
// Therefore, the priorities of the thread is 5, the default value  
  
// 1st Thread  
// Displaying the priority of the thread  
// using the getPriority() method  
System.out.println("Priority of the thread th1 is : " + th1.getPriority());  
  
// 2nd Thread   
// Display the priority of the thread  
System.out.println("Priority of the thread th2 is : " + th2.getPriority());  
  
// 3rd Thread   
// // Display the priority of the thread  
System.out.println("Priority of the thread th2 is : " + th2.getPriority());  
  
// Setting priorities of above threads by  
// passing integer arguments  
th1.setPriority(6);  
th2.setPriority(3);  
th3.setPriority(9);  
  
// 6  
System.out.println("Priority of the thread th1 is : " + th1.getPriority());  
  
// 3  
System.out.println("Priority of the thread th2 is : " + th2.getPriority());  
  
// 9  
System.out.println("Priority of the thread th3 is : " + th3.getPriority());  
  
// Main thread  
  
// Displaying name of the currently executing thread   
System.out.println("Currently Executing The Thread : " + Thread.currentThread().getName());  
  
System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());  
  
// Priority of the main thread is 10 now  
Thread.currentThread().setPriority(10);  
  
System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());  
}  
}  

