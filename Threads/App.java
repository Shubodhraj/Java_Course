// class MyTask extends Thread{
//     public void run(){
//         for(int doc =1; doc<=10; doc++){
//         System.out.println("@@ printing document #"+doc+"-printer2");
//     }
// }
// }

class CA{
    public static void hello(){
        System.out.println("Hello");
     }
    
}
// class MyTask extends CA, Thread{ multiple inheritance is not supported. it can be achieved using interface.


class MyTask extends CA implements Runnable{
    public void run(){
        for(int doc =1; doc<=10; doc++){
        System.out.println("@@ printing document #"+doc+"-printer2");
        CA.hello();
    }
    }
}  

public class App {    
//main method represents the main thread
public static void main(String[] args) {
    //whatever task we give here, will be executed by the main thread
    //thread always execute the jobs in sequence
    //job1
    System.out.println("==Application Started==");
    //for example now we would like to print some document ids

    //job2
    // MyTask task = new MyTask(); //child thread
    //task.executeTask();
    // task.start(); //start will internally execute run() method.
    Runnable r = new MyTask();
    Thread task = new Thread(r);
    task.start();
    //when job2 is finished, job3 will be executed.

    for(int doc=1;doc<=10;doc++){
        System.out.println("printing document #"+doc);
    }
    //job3
    System.out.println("==Application Finished==");
}

}
