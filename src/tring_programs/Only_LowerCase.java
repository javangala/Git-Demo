package tring_programs;

public class Only_LowerCase {
	
	public static void main(String[] args) {

		String s="TestingTempAutomation";
		
		int count=0;
		char[] temp=s.toCharArray();
		
		for (int i = 0; i < temp.length; i++) {
			
			if (Character.isLowerCase(temp[i])) {
				
				count++;
				
				System.out.println(temp[i]);
			}
		}
		System.out.println("count of lowercase letters.."+count);
	}

}
