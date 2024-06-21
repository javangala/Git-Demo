package ring;

public class Remove_SpecialChars {

	public static void main(String[] args) {
		String s="Andhra Bank @ 2024 #Abc $500 %&";
		String snew=s.replaceAll("[^A-Z,a-z,0-9, ]", "");
		System.out.println(snew);
	}
}
