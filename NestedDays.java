class NestedDays {
    public static void main(String[] args) {
        
        int days = 7;
        int week = 3;
        for (int i =1; i<=week; i++ ){
            System.out.println("Week: "+ i);

            for(int j = 1; j<=days; j++){
                System.out.println(" Days: "+j);
            }
            System.out.println(" ");
        }
    }
    
}
