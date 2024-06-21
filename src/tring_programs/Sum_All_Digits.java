package tring_programs;

public class Sum_All_Digits {

	public static void main(String[] args) {

		String s="Ajs123kjd5217ndjd54";

		int temp=0;
		
		char[] ch=s.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			if (!Character.isAlphabetic(ch[i])) {
				int number=Character.getNumericValue(ch[i]);
				temp=temp+number;
			}
			
		}
		System.out.println(temp);
	}

}
