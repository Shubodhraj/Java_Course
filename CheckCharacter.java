import java.util.*;

public class CheckCharacter {
    public static void main(String[] args) {
        String[] arr1 = new String[10];
        arr1[0] = "c";
        arr1[1] = "f";
        arr1[2] = "r";
        arr1[3] = "b";
        arr1[4] = "t";
        arr1[5] = "i";
        arr1[6] = "s";
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any character");
        String c = sc.nextLine();

        for (int i = 0; i < 7; i++) {

            if (arr1[i] == c) {
                System.out.println("Winner");

            } else {
                System.out.println("Chicken dinner");
                break;
            }
        }

    }
}