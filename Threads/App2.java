class NewThread implements Runnable {  
    String name;  
    Thread thread;  
    NewThread (String name){  
        this.name = name;   
        thread = new Thread(this, name);  
        System.out.println( "A New thread: " + thread+ "is created\n" );  
        thread.start();  
    }  
    public void run() {  
    try {  
        for(int j = 5; j > 0; j--) {  
            System.out.println(name + ": " + j);  
            Thread.sleep(1000);  
        }  
    }catch (InterruptedException e) {  
        System.out.println(name + " thread Interrupted");  
    }  
     System.out.println(name + " thread exiting.");  
    }  
}  
class ThreadExample2 {    
    public static void main(String args[]) {  
        new NewThread("1st");  
        new NewThread("2nd");  
        new NewThread("3rd");  
        try {  
            Thread.sleep(8000);  
        } catch (InterruptedException excetion) {  
            System.out.println("Inturruption occurs in Main Thread");  
        }  
        System.out.println("We are exiting from Main Thread");  
    }  
}  