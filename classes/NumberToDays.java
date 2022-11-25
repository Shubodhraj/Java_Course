package classes;

import java.util.Scanner;

public class NumberToDays {


    void numberToDays(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a number between 1 to 7: ");
    int n = sc.nextInt();
    //String [] days = new String[7];
    String [] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    if(n<=0 || n>=8){
        System.out.println("Invalid entry");
    }
    // List <String> list1 = new ArrayList<>();
    else{
        
    
    System.out.println(days[n-1]);
    }

    }


    
public static void main(String[] args) {
    NumberToDays nd = new NumberToDays();
    nd.numberToDays();

    //To define the number of elements that an array can hold, we have to allocate memory for the array in Java.
}
    
}
