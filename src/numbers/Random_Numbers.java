package numbers;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class Random_Numbers {

	public static void main(String[] args) {

		int num=5;

		Random random=new Random();

		//Generate random integer without upper bound

		int int_value=random.nextInt();
		//		System.out.println("Random integer without integer limit..>"+int_value);
		//		
		//		//generate random integer with upper bound 
		//		int int_value2=random.nextInt(num);
		//		System.out.println("Random integer with integer limit.."+int_value2);
		//		
		//		//Generate random double without upper bound
		//		System.out.println("Random double without limit>>>"+random.nextDouble());
		//		
		//		//generate random integer with upper bound
		//		System.out.println("Random double witho limit>>>"+random.nextDouble(1.2));
		//		
		//		//Generate random float without upper bound
		//		System.out.println("Random float witho limit>>>"+random.nextFloat());
		//		
		//		//Generate random float with upper bound
		//		System.out.println("Random float witho limit>>>"+random.nextFloat((float) 0.9));
		//		
		//		
		//		//Generate random String  
		//		String randomString = UUID.randomUUID().toString();
		//		System.out.println("Random string...>>"+randomString);



		//		//####-Generate random int number Using the math.random() method of Math class
		//		
		//		int randomNum=(int)(Math.random());
		//	    System.out.println("random value...>>"+randomNum);
		//	    
		//		int randomNumber=(int)(Math.random()*9);
		//	    System.out.println("random value...>>"+randomNumber);
		//	    
		//	    
		//	    //Generate random double number Using the math.random() method of Math class
		//	    double double_randomNum=Math.random();
		//	    System.out.println("random value...>>"+double_randomNum);
		//	    
		//	    double double_randomNum1=Math.random()*1.2;
		//	    System.out.println("random value...>>"+double_randomNum1);

		//####-Generate random int number Using the _ThreadLocalRandom_ method of Math class

		int rand_int1 = ThreadLocalRandom.current().nextInt();
		System.out.println("random value...>>"+rand_int1);

		int rand_int2 = ThreadLocalRandom.current().nextInt(99);
		System.out.println("random value...>>"+rand_int2);

		//Generate random doubles

		double rand_dub1 = ThreadLocalRandom.current().nextDouble();
		double rand_dub2 = ThreadLocalRandom.current().nextDouble(1.2);

		System.out.println("Random Doubles: " + rand_dub1);
		System.out.println("Random Doubles: " + rand_dub2);

	}

}
