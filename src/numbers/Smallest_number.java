package numbers;

public class Smallest_number {

	public static void main(String[] args) {
		int num[]=new int[] {23,54,7,81,45,76,61,90,115,2,34};
		int smallest=num[0];
		
		for (int i = 1; i < num.length; i++) {
			
			if (num[i]<smallest) {
				
				smallest=num[i];
			}
		}
		System.out.println(smallest);
	}
}
