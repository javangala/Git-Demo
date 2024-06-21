package ring;

public class Remove_Uppercase {

	public static void main(String[] args) {
		String s="Andhra Bank";
		String snew=s.replaceAll("[A-Z]", "");
		System.out.println(snew);
	}
}
