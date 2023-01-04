package ExmPrep;
//For each loop demo
public class ForEachDemo {
    
    void forEach(){
        int[] num = {1,2,3,4,5};

        for(int n: num){
            System.out.println(n);
        }


    }

    public static void main(String[] args) {
        ForEachDemo fe = new ForEachDemo();
        fe.forEach();
    }
}



