class DArray {
    public static void main(String[] args) {
        int [][] arr = new int[2][2];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;
        //we can also declare array as:
        // int [][] arr = {{1,2},{3,4}}
        System.out.println(arr[0][0]);
        //Now imagine we have a very huge array of size 100 rows and 500 columns.
        //It will be very much hectic to print all the elements in the array.
        //To make the process more easy we can use nested loop.
    }
}

class TwoDArray{
    public static void main(String[] args) {
        int [][] arr = {{1,2},{3,4}};

        for(int i =0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();  
        }
    }

}
