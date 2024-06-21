package tring_programs;

public class OnlyChar {

	public static void main(String[] args) {

		String s="Testing2425Tem08pAutom^ation484878%";

		int count=0;
		
		char[] temp=s.toCharArray();

		for (int i = 0; i < temp.length; i++) {

			if (Character.isAlphabetic(temp[i])) {
				count++;
				System.out.println(temp[i]);
				
			}

		}
		System.out.println("total count of alphabets...."+count);


	}

}
