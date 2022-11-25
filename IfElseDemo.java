import java.util.Scanner;

// class IfElseDemo {
//     public static void main(String[] args) {
//         int i = 1;
//         if (i<=10)
//         {
//             System.out.println("The value of i is less than or equal to 10");
//         }
//         else{
//             System.out.println("The value of i is greater than 10");
//         }


//     }
// }

class IfElseDemo {
    public static void main(String[] args) {
        
        int i = 10;
         
        if (i<=10 & i>0)
        {
            System.out.println("The value of i is less than or equal to 10");
        }
        else if(i>10)
        {
            System.out.println("The value of i is greater than 10");
        }
        else if (i<0)
        {
            System.out.println("The value of i is less than 0");
        }
        else{
            System.out.println("The value of i is invalid");
        }
    }
}
