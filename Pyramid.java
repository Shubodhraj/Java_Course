public class Pyramid {
        
    // public static void main(String[] args) {
    //     int rows = 5, k = 0;
    
    //     for (int i = 1; i <= rows; ++i, k=0) {
    //       for (int space = 1; space <= rows - i; ++space) {
    //         System.out.print("  ");
    //       }
    
    //       while (k != 2 * i - 1) {
    //         System.out.print("* ");
    //         k ++;
    //       }
    
    //       System.out.println();
    //     }
    // }

    public static void pyramidPattern(int n) 
    {  
        for (int i=0; i<n; i++) //outer loop for number of rows(n)
        { 
        for (int j=n-i; j>1; j--) //inner loop for spaces
            { 
                System.out.print(" "); //print space
            }  
            for (int j=0; j<=i; j++ ) //inner loop for number of columns
            { 
                System.out.print("* "); //print star
            } 
  
            System.out.println(); //ending line after each row
        } 
    } 
  
    public static void main(String args[]) //driver function
    { 
        int n = 5; 
        pyramidPattern(n); 
    } 
}
