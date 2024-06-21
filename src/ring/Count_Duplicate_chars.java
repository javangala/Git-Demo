package ring;

import java.util.Arrays;

public class Count_Duplicate_chars {


	public static void main(String[] args) {

		String s="National highway 16b";
		char[] ch=s.toCharArray();

		boolean[] b=new  boolean[ch.length];
		Arrays.fill(b, false);

		for (int i = 0; i < ch.length; i++) {

			int count=0;

			if (b[i]==true) {
				continue;
			}
			if (Character.isAlphabetic(ch[i])) {

				for (int j = i; j < ch.length; j++) {

					if (ch[i]==ch[j]) {
						b[j]=true;
						count++;
					}
				}
				if (count>1) {

					System.out.println(ch[i]+" ..count is.."+count);

				}
			}
		}
	}
}