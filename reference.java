// class reference {
//     public static void main(String[] args) {
//         int a = 5;
//         int b = a;
//         String s = "hello";
//         String s1 = s;
//         System.out.println(s.hashCode());
//         System.out.println(s1.hashCode());
        
//     }
// }

class reference1{
    public static void main(String[] args) {
        int [] a = new int[5];
        int[] b = a;
        a[0] = 1;
        b[0] = 2;
        a[1] = 1;
        b[1] = 3;
    System.out.println(a[0]);
    System.out.println(b[0]);
    System.out.println(a[1]);
    System.out.println(b[1]);


    }
}