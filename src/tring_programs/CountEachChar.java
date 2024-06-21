package tring_programs;

import java.util.Arrays;

public class CountEachChar {

	public static void main(String[] args) {

		String s="aa1bb c22dd 33eee 444f ggg";

		char[] temp=s.toCharArray();

		boolean[] b=new boolean[temp.length];
		Arrays.fill(b,false);

		for (int i = 0; i < temp.length; i++) {

			if(b[i]==true) {
				continue;
			}

			int count=0;
			for (int j = i; j < temp.length; j++) {

				if(temp[i]==temp[j]) {
					b[j]=true;
					count++;
				}
			}

			System.out.println(temp[i] + " count :::: " +count);				
		}
	}
}
