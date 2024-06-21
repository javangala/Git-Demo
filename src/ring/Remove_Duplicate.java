package ring;

import java.util.Arrays;

public class Remove_Duplicate {
	public static void main(String[] args) {

		String s="national highway 16b";
		char[] ch=s.toCharArray();

		boolean[] b=new  boolean[ch.length];
		Arrays.fill(b, false);

		for (int i = 0; i < ch.length; i++) {

			if (b[i]==true) {
				continue;
			}
			if (Character.isAlphabetic(ch[i])) {
				
				for (int j = i; j < ch.length; j++) {

					if (ch[i]==ch[j]) {
						b[j]=true;
						
					}
				}
				
					System.out.println(ch[i]);
				
			}

		}

	}
}
