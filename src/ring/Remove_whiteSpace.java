package ring;

public class Remove_whiteSpace {

	public static void main(String[] args) {

		String s="Samasung Open Tap Mobile";
		System.out.println("before white space remove..legth.."+s.length());

		//				String snew=s.replaceAll(" ", "");
		//				System.out.println("after remove white space ...::"+snew);

		int count=0;
		char[] ch=s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (!Character.isSpaceChar(ch[i])) {

				count++;

				System.out.print(ch[i]);

			}
		}	

		System.out.println(" ");
		System.out.println("Total chars.."+count);

	}
}
