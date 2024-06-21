package ring;

public class Remove_Lowercase {

	public static void main(String[] args) {
		String s="Iphone Fourteen Pro Max";
		String snew=s.replaceAll("[a-z]", "");
		System.out.println(snew);
	}
}
