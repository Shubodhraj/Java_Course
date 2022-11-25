import java.util.*;

// public class DoWhile {
//     public static void main(String[] args) {
//         int i = 1, n=5;

//         do{
//             System.out.println(i);
//             i++;
//         }while(i<=n); 
//     }
    
// }

class DoWhile1 {
    public static void main(String[] args) {
      Calculator cal = new Calculator();  
      int sum = 0;
      int number = 0;
  
      // create an object of Scanner class
      Scanner input = new Scanner(System.in);
         
      // do...while loop continues 
      // until entered number is positive
      do {
        // add only positive numbers
        sum += number;
        System.out.println("Enter a number");
        number = input.nextInt();
      } while(number >= 0); 
         
      System.out.println("Sum = " + sum);
      input.close();
    }
  }