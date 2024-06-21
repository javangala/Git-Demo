package ring;

public class Length {

	public static void main(String[] args) {
		String s="    Samasung Open Tap Mobile    ";
		
		System.out.println(s.length());
		
		int count=0;

		for (int i = 0; i < s.length(); i++) {
			count++;
			
		}
				System.out.println(count);

		System.out.println("after trim white space ...::"+s.trim().length());
	}
}


