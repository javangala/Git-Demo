package numbers;

public class Amstrong {

	public static void main(String[] args) {
		
		
		int num=153 ,reminder , result=0;		
		int original=num;
				
		while (original!=0) {
			
			reminder=original%10;
			result+=Math.pow(reminder, 3);
			original/=10;
			
		}
		
		
		if(result==num) {
			
			System.out.println(num +" is amstrong");
			
		}else {
			
			System.out.println(num+"is not amstrong");
		}
		
		
	}
}
