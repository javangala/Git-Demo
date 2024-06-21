package array;

public class Sorting_Using_BubleSort_IntArray {

	public static void main(String[] args) {

		int[] num= {11,24,3,94,59,60};
		int temp=0;

		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if (num[i]>num[j]) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
			System.out.print(num[i]+" ");
		}


		/*
		 * public static void main(String[] args) {
		int[] num= {11,24,3,94,59,60};	
		bubleSort(num);

	}

	static void bubleSort(int[] intvalue) {

		int temp=0;
		for (int i = 0; i < intvalue.length; i++) {
			for (int j = i+1; j < intvalue.length; j++) {
				if (intvalue[i]>intvalue[j]) {
					temp=intvalue[i];
					intvalue[i]=intvalue[j];
					intvalue[j]=temp;
				}
			}
			System.out.println(intvalue[i]+" ");
		}

	}
		 */

	}

}
