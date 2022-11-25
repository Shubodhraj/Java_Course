class ThreadExample extends Thread {

    void function1() {
        for (int doc = 1; doc <= 10; doc++) {
            System.out.println("printing document #" + doc);
        }
    }
    public void run() {
        for (int doc = 1; doc <= 10; doc++) {
            System.out.println("@@printing document #" + doc);
        }
    }
    // main method represents the main thread
    public static void main(String[] args) {

        ThreadExample te = new ThreadExample();
        Thread t = new Thread(te);
        System.out.println("==Application Started==");
        // te.start();
        System.out.println("Priority of Thread: " +t.getPriority());
        System.out.println("Name of Thread: " +t.getName());
        System.out.println("Currently Executing The Thread : " + Thread.currentThread().getName());
        t.start();
        te.function1();
        //set the priority of the thread
        te.setPriority(7);
        //get the priority of the thread
        System.out.println(te.getPriority());
        Thread.currentThread().setPriority(9);
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(te.getPriority());
        System.out.println("==Application Finished==");
    }

}
