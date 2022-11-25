class A {
    public static void main(String[] args) {
        byte b = 8; //8 bit
        // int a = 8; //32 bit
        // double d = 8; //64 bit
        char c = 'C'; // 16 bit

        //performing implicit type casting
        float f; //32 bits
        f = b;
        f = c; 
        System.out.println(f);
        //int i = d; // example for incompatible data types
        //System.out.println(i);
    }

    public void displayName() {
    }
    
}
