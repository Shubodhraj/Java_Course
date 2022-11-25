import java.util.*;

public class ReturnExample1 {
    double caclArea(double l, double b){
        double area = l*b;
        System.out.println("The area of rectangle is : "+ area);
        return area;
    }

    void calcVolume(double area, double volum ){
        //double area = caclArea(l, b);
        double volume = volum * area;
        System.out.println("The volume of rectangle is: "+volume);
        //return volume;
    }    

public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);

    System.out.println("Please enter the length, breadth, and volume of rectangel: ");
    double l = sc.nextDouble();
    double b = sc.nextDouble();
    double v = sc.nextDouble();
    ReturnExample1 re = new ReturnExample1();
    //re.caclArea(l, b);
    //double area = re.caclArea(l, b);
    re.calcVolume(re.caclArea(l, b),v);
    //re.calcVolume(re.caclArea(l, b),v);
}

}

