package ring;

public class Palindrome {

	public static void main(String[] args) {
		
	//	String s="Madam";
		
		String s="madam";
		String s1="";

		for (int i = s.length()-1; i >=0 ; i--) {
			s1=s1+s.charAt(i);
		}
		
		
		/*if string is CaseSencitive we can use equalsIgnoreCase */

		//if (s.equalsIgnoreCase(s1)) { 
		
		if (s.equals(s1)) {
			System.out.println(s+"..is palindrome");
		}else {
			System.out.println(s+"..is not palindrome");

		}

	}


}
