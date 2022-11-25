package Pack2;
public class PackageE1 {
    void printInfo(){
        System.out.println("My name is class PackageExample");
        System.out.println("I reside inside the package, Pakcages!! ");
    }
    public static void main(String[] args) {
        PackageE1 p1 = new PackageE1();
        p1.printInfo();
    }
    
}
// javac -d . PackageE1.java 