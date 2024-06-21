package a_Ruff;

public class Compiling_A_to_Z {

	public static void main(String[] args) {

		String s="The quick brown fox jumps over the lazy dog.";

		String s1="^[a-zA-Z]*$";

		String s2="";

		char[] ch=s.toCharArray();

		for(int i=0; i<ch.length;i++){

			if(Character.isAlphabetic(ch[i]))

				s2=s2+ch[i];

		}
		System.out.println(s1);
		System.out.println(s2);
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		//		System.out.println(s2);
	}
}
