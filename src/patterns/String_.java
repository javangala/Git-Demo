package patterns;

public class String_ {

	public static void main(String[] args) {
		
		String s="Selenium";
		
		int len=s.length();
		
		for (int i = 0; i <len; i++) {
			for (int j = 0; j <=i; j++) {
				//System.out.print(s.charAt(j)+" ");
				System.out.print("  ");
			}
			
			for (int k = i; k <len; k++) {
				System.out.print(s.charAt(k)+" ");
			}
			
			System.out.println();
		}
	}
}
