package numbers;

public class Largest_Number {

	public static void main(String[] args) {
		
		//int num[]=new int[] {78,12,3,5,76,89,90,23,45,71,54};
		
		int num[]={78,12,3,5,76,89,90,23,45,71,54};
		
		int largest=num[0];
		
		for (int i = 1; i < num.length; i++) {
			
			if (num[i]>largest) {
				
				largest=num[i];
			}
			
		}
		System.out.println(largest);
	}
}
