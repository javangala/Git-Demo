package ring;

import java.util.Iterator;

public class Remove_Numbers {

	public static void main(String[] args) {
		
//		String s="qw154jd33jd";
//		
//		for (int i = 0; i < s.length(); i++) {
//			
//			char ch=s.charAt(i);
//			if (Character.isAlphabetic(ch)) {
//				
//				System.out.print(ch);
//			}
//		}
		
		
		String s="bob 123 anthony";
		String snew=s.replaceAll("[0-9]", "");
		System.out.println(snew);
	}
}
