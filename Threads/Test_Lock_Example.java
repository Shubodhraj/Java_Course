class Table{
    synchronized void printTable(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n*i);
            try{
                Thread.sleep(2000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}


class MyThread1 extends Thread{
    Table table;
   public MyThread1(Table table){
    this.table = table;
   }

   public void run(){
    table.printTable(5);
   }
}


class MyThread2 extends Thread{
    Table table;
   public MyThread2(Table table){
    this.table = table;
   }

   public void run(){
    table.printTable(7);
   }
}



public class Test_Lock_Example {
    public static void main(String[] args) {
        Table obj = new Table();
        MyThread1 t1 = new MyThread1(obj);
        t1.start();

        MyThread2 t2 = new MyThread2(obj);
        t2.start();

        
    }
    
}
