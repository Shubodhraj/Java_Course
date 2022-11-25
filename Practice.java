// public class Practice {
 
//     void disp(String na, String add){
//     System.out.println("The name of student is: "+na);
//     System.out.println("The address of student is: "+add);
// }
// public static void main(String[] args) {
//    Practice p = new Practice();
//    p.disp("ram", "KTM");
//    p.disp("hariram", "KTMCTY");
  


// }
public class Practice {
 
String name, address;
    Practice(String n, String m){
        this.name = n;
        this.address = m;

    }
    public void disp(){
        System.out.println("The name of the student is: " + name);
        System.out.println("The address of the student is:"+address);
    }
    public static void main(String[] args) {
        Practice p = new Practice("Ram", "KTM");
        Practice p1 = new Practice("Shyam", "BKTPR");
        Practice p2 = new Practice("Hari", "LALTPR");
        // p.name = "ram";
        // p.address = "Ktm";
        p.disp();
        // p1.name = "hari";
        // p1.address = "BKTPR";
        p1.disp();
        p2.disp();
    }
}



