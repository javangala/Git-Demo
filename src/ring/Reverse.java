package ring;

public class Reverse {

	public static void main(String[] args) {
		String str="SyzRtyTY";
		
		
		StringBuilder sb=new StringBuilder();
		sb.append(str);
		sb.reverse();
		System.out.println(sb);
		
		for (int i = str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
			
			
		}
	}
}
