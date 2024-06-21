package a_Ruff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ruff_01 {

	public static void main(String[] args) {
		
		int[] array1= {1,2,3,4,5};
		int[] array2= {1,2,3,4,7};
		UniqeChars(array1, array2);
		UniqeChars(array2, array1);
		
		
	}
	public static void UniqeChars(int[] array1, int[] array2) {
		
		for(int i=0; i<array1.length; i++) {
			boolean uniqe=true;
			for(int j=0; j<array2.length; j++) {
				if(array1[i]==array2[j]) {
					uniqe=false;
				}
			}if(uniqe) {
				System.out.println(array1[i]);
			}
		}
	}
	

}
