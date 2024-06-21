package tring_programs;

public class Only_UpperCase {
	
	public static void main(String[] args) {

		String s="Testin15236gTempAuto73643mation081";
		
		int count=0;
		char[] temp=s.toCharArray();
		
		for (int i = 0; i < temp.length; i++) {
			
			if (Character.isUpperCase(temp[i])) {
				
				count++;
					
				//System.out.println(count);
				System.out.println(temp[i]);
			}
			
		}
		System.out.println("Total uppercase letters...."+count);
	}

}
