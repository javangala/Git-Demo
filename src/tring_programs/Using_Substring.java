package tring_programs;

public class Using_Substring {
	
	public static void main(String[] args) {
		
		/*here "substring()" method will take from starting index to ending index*/
		
		String s="maheshjavangala12345";
		String s2=s.substring(s.length()-4, s.length());
		System.out.println(s2);
		
		/*here "substring()" method will take from starting index*/

		String mj="mahesh javangala 2345";
		String mj1=mj.substring(mj.length()-4);
		System.out.println(mj1);
		
		/*inside the "substring()" method we can use "lastIndexOf()" method ,
		 * then it will returns substring from which we were given inside "lastIndexOf()" method 
		 */
		String mj4="Ravindra Bollu";
		
		String mj2=mj4.substring(mj4.lastIndexOf(" "));
		
		System.out.println(mj2);
				
				
	}

}
