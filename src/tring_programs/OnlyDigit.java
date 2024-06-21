package tring_programs;

public class OnlyDigit {
	
	public static void main(String[] args) {

		String s="Testing2343TempAuto35897ymation";
		
		int count=0;
		char[] temp=s.toCharArray();
		
		for (int i = 0; i < temp.length; i++) {
			
			if (Character.isDigit(temp[i])) {
				count++;
				System.out.println(temp[i]);
			}
		}
		System.out.println("totoal count of numbers...."+count);
	}
}
