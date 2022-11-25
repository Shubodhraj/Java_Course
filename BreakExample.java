class BreakExample {
    public static void main(String[] args) {
        for(int i =0; i <=10; i++){
            
            if(i==6){
                break;
            }
            System.out.println(i);    
        }
    }
    
}

class ContinueExample {
    public static void main(String[] args) {
        for(int i =0; i <=10; i++){
            
            if(i==6){
                continue;
            }
            System.out.println(i);
        }
    }
    
}
//Write a program that takes the 10 different college name as input and stores them in a list and only print the name of colleges until the loop does not find
//your college name.
//Similarly write a program that prints all 9 different colleges name except yours college name.