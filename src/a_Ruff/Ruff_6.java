package a_Ruff;

public class Ruff_6 {
	public static void main(String[] args) {
		
		String s="mahesh";
		System.out.println("Say 'Good mornig' Untill 12 pm");
		System.out.println("Say 'Good Afternoon' Untill 5 pm");
		System.out.println("Say 'Good Evening' Untill 8 pm");
		System.out.println("Say 'Good Night'  8 pm onwords");
		

		System.out.println(Uppercase(s));
	}
	
	public static String Uppercase(String s) {
		
		String temp=s.toUpperCase();
		
		return temp;
	}

}
