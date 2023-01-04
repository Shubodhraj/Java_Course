package ExmPrep;

//to solve this problem use any one function: either sumNamtural(int n)
// or sumNamturalRecursive(int n). Dont use both in the same class.

public class RecursiveDemo {
//using simple loop.
public void sumNamtural(int n){
    int m=0 ;
for(int i = 1; i<=n; i++){
       m=m+i; 

}   
System.out.println(m);
}
//find sum using recursive technique. 
public int sumNamturalRecursive(int n){
       
    if (n <= 0) {
        return 0;
    }

    return n + sumNamturalRecursive(n - 1);
}


public static void main(String[] args) {
    RecursiveDemo rd = new RecursiveDemo();
    int result = rd.sumNamturalRecursive(50);//use this line
    System.out.println(result);// and this line if you are using 
    //sumNamturalRecursive(int n) function. otherwise remove these lines.
    rd.sumNamtural(50);
}
}


