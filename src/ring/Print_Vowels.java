package ring;

public class Print_Vowels {

	public static void main(String[] args) {
		
		String s="State Bank Of India";
		
		System.out.println();
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			
			char ch=Character.toLowerCase(s.charAt(i));
			
			if ((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')) {
				
				count++;
				System.out.println(ch);
			}
		}
		//System.out.println();
	}
}
