package numbers;

public class Automorphic_Number {

	public static void main(String[] args) {


		int x=25;
		int y=x*x;
		
		System.out.println(y%10);
		System.out.println(x%10);
		
		if(y%10==x%10)
			System.out.println(x+"...automorphic");
		else
			System.out.println("not");


	}

}


//An automorphic number is a number whose square has the same digits in the end as the number itself.

//For example, 25 is an automorphic number because the square of 25 is 625, which ends with 25.
