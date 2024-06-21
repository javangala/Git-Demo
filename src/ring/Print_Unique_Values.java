package ring;

import java.util.Arrays;

public class Print_Unique_Values {
	public static void main(String[] args) {
		
		/*	String[] s= {"a","b","c","a","b"};
		
		boolean[] b=new boolean[s.length] ;
		Arrays.fill(b, false);
		
		for (int i = 0; i < s.length; i++) {
			if (b[i]==true) {
				continue;
			}
			for (int j = 0; j < s.length; j++) {
				if(s[i].equalsIgnoreCase(s[j])) {
					b[j]=true;
				}
			}
			System.out.println(s[i]);
		}
	
	}
	*/
	
	/* type-2*/
		
		String[] s={"ba","ca","mca","mba","ba","mca","bsc"};
		
		boolean[] b=new boolean[s.length];
		Arrays.fill(b, false);
		
		for (int i = 0; i < s.length; i++) {
			
			if (b[i]==true) {
				continue;
			}
				for (int j = i+1; j < s.length; j++) {
					
					/* we can use equalsIgnoreCase if there is caseSencitive */
					
					//if (s[i].equalsIgnoreCase(s[j])) {  

					if (s[i].equals(s[j])) {
						b[j]=true;
					}
				}
				System.out.println(s[i]);
			}
		}		
	}


