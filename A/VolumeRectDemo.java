package A;

import java.util.Scanner;

public class VolumeRectDemo {
    static final float height = 5;
    
    

    float lenght;
    float breadth;

    VolumeRectDemo(float len, float bre){
        // this.lenght = len;
        // this.breadth = bre;
        float area = len * bre;
        System.out.println(area);

    }
    
    VolumeRectDemo(float len, float bre, float height){
        // this.lenght = len;
        // this.breadth = bre;
        float volume = len*bre*height;
        System.out.println(volume);
    }

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for lenght");
        float len=sc.nextFloat();
        System.out.println("enter the value for bredth");
        float bre = sc.nextFloat();
        
        VolumeRectDemo vr = new VolumeRectDemo(len, bre);
        VolumeRectDemo vrh = new VolumeRectDemo(len, bre, height);
    }

    
}
