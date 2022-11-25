public class MyRunnable implements Runnable {

    void function1() {
        for (int doc = 1; doc <= 10; doc++) {
            System.out.println("printing document #" + doc);
        }
    }
    @Override
    public void run() {
        for (int doc = 1; doc <= 10; doc++) {
            System.out.println("@@printing document #" + doc);
        }
    }

    // main method represents the main thread
    public static void main(String[] args) {
        
        MyRunnable mr = new MyRunnable();

        
        Runnable r = new MyRunnable();
        Thread te = new Thread(r);
        
        System.out.println("==Application Started==");

        mr.function1();
        
        te.start();
        System.out.println("Currently Executing The Thread : " + Thread.currentThread().getName());  

        System.out.println("==Application Finished==");

        // Displaying name of the currently executing thread   
        System.out.println("Currently Executing The Thread : " + Thread.currentThread().getName());  
  
        System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());  
  
        // Priority of the main thread is 10 now  
        Thread.currentThread().setPriority(10);  
  
        System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());  


    }

}
