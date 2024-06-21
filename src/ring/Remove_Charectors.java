package ring;

public class Remove_Charectors {

	public static void main(String[] args) {
		
//		String s="mahesh1501java789";
//		
//		for (int i = 0; i < s.length(); i++) {
//			char ch=s.charAt(i);
//			if (Character.isDigit(ch)) {
//				System.out.print(ch);
//				
//			}
//		}
		
		String s="ap26az6144KLK";
		//String snew=s.replaceAll("[a-z,A-Z]", "");
		String snew=s.replaceAll("[a-z]", "");
		System.out.println(snew);
	}
}
