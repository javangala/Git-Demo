package array;

import java.util.Arrays;

public class Duplicate_Count {

	public static void main(String[] args) {

		int[]array= {1,2,3,1,4,5,2,4,1,3,9,4,2,5};



		boolean [] dup=new boolean[array.length];
		Arrays.fill(dup, false);

		for (int i = 0; i < array.length; i++) {
			if (dup[i]==true) {
				continue;
			}
			int count=0;
			for (int j = 0; j < array.length; j++) {

				if (array[i]==array[j]) {
					dup[j]=true;
					count++;

				}
			}

			System.out.println(array[i]+" - "+count);

		}
	}

}
