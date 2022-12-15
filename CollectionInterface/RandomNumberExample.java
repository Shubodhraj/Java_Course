package CollectionInterface;



import java.util.Random;

public class RandomNumberExample {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt());

        //generates boolean value
		System.out.println(random.nextBoolean());
		
		//generates double value
		System.out.println(random.nextDouble());
		
		//generates float value
		System.out.println(random.nextFloat());
		
		//generates int value
		System.out.println(random.nextInt());
		
		//generates int value within specific limit
		System.out.println(random.nextInt(20));



    }
}
