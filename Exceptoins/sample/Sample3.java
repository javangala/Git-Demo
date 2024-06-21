package sample;

public class Sample3 {

	public static void main(String[] args) {


		int i=0;
		int j=0;				

		try{
			j=18/i;
		}
		catch(ArithmeticException e) {

		j=18/1;
		}
		catch(Exception e) {
			System.out.println("Something went wrong  "+e);
		}

		System.out.println(j);		
		System.out.println("bye");

	}

}
