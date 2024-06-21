package a_Ruff;
import java.util.Arrays;

public class Ruff_5 {

	public static void main(String[] args) {

		String[] s= {"ja","va","ja","ba","ca","mba","ba" };
		
		boolean[] b=new boolean[s.length];
		Arrays.fill(b, false);
		
		for (int i = 0; i < s.length; i++) {
			
			if(b[i]==false) {
			for (int j = i; j < s.length; j++) {
				if (s[i].equalsIgnoreCase(s[j])) {
					b[j]=true;
					
				}
			}
			System.out.print(s[i]+" ");
			
		}
		
	}
}
}
