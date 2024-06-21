package ring;

public class Print_Capital_Letters {

	public static void main(String[] args) {
		String ab="SyzRtyTY";
		
		for (int i = 0; i < ab.length(); i++) {
			
			if (Character.isUpperCase(ab.charAt(i))) {
				
				System.out.println(ab.charAt(i));
				
			}
		}		
		
	}
}
