package pack1;


public class NestedFor {
    public static void main(String[] args) {
        
    
          int weeks = 3;
          int days = 7;
      
          // outer loop prints weeksweek
          for (int i = 1; i <= weeks; ++i) {
            System.out.println("Week: " + i);
      
            // inner loop prints days
            for (int j = 1; j <= days; ++j) {
              System.out.println("  Day: " + j);
            }
          }
        }
      }
    

class NestedFor1{
    public static void main(String[] args) {
        int rows = 5;

        // outer loop
        for (int i = 1; i <= rows; ++i) {
    
          // inner loop to print the numbers
          for (int j = 1; j <= i; ++j) {
            System.out.print(j +" ");
          }
          System.out.println("");
        }
    }
}

class NestedFor2{
    public static void main(String[] args) {
        //int rows = 5;
        

        // outer loop
        for (int i = 5; i >= 0; i--) {
    
          // inner loop to print the numbers
          for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
          }
          System.out.println("");
        }
    }
}