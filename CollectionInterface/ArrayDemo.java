package CollectionInterface;



import java.util.Arrays;

class ArrayDemo {

    void printArray(){
        System.out.println("Hello I am array");
    }

    public static void main(String[] args) {
        // declares an array of integers
        int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[10];
           
        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 800;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 50;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;
        
        int[] arr = {0,5,7,6,3,2,1,9,8};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // System.out.println("Element at index 0: "
        //                    + anArray[0]);
        // System.out.println("Element at index 1: "
        //                    + anArray[1]);
        // System.out.println("Element at index 2: "
        //                    + anArray[2]);
        // System.out.println("Element at index 3: "
        //                    + anArray[3]);
        // System.out.println("Element at index 4: "
        //                    + anArray[4]);
        // System.out.println("Element at index 5: "
        //                    + anArray[5]);
        // System.out.println("Element at index 6: "
        //                    + anArray[6]);
        // System.out.println("Element at index 7: "
        //                    + anArray[7]);
        // System.out.println("Element at index 8: "
        //                    + anArray[8]);
        // System.out.println("Element at index 9: "
        //                    + anArray[9]);
        System.out.println(Arrays.toString(anArray));
        for(int i=0; i<=10;i++){
            System.out.println(anArray[i]);
        }
            
       
    }
} 