package sample;

public class Ruff {
	
	public static void main(String[] args) {
		
		int i=2;
		int j=0;
		int nums[]=new int[5];
		String s=null; 
		
		try {
			 j=10/i;
			 System.out.println(s.length());
			 System.out.println(nums[1]);
			 System.out.println(nums[5]);
			
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot devide");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Stay in limit");
		}
		catch(Exception e) {
			System.out.println("Something went wrong"+e);
		}
		
		System.out.println(j);
		System.out.println("bye");
	}
	

}
