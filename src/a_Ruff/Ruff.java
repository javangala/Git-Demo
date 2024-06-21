package a_Ruff;
import java.util.Arrays;



public class Ruff {
	public static void main(String[] args) {

		String[] s= {"ja","va","ja","ba","ca","mba","ba" };

		for(int i=0; i<s.length; i++) {
			boolean flag= true;
			for(int j=i; j<s.length; j++) {
				if(i!=j && s[i].equals(s[j])) {
					flag=false;
					break;
				}
			}if(flag) {
				System.out.println(s[i]);
			}
		}
	}
}
