package packages;

public class PackageExample {
    void printInfo(){
        System.out.println("My name is class PackageExample");
        System.out.println("I reside inside the package, Pakcages!! ");
    }
    public static void main(String[] args) {
        PackageExample pe = new PackageExample();
        pe.printInfo();
    }
    
}
