package ring;

public class Print_Consonents {
	public static void main(String[] args) {
		
		String s="Indian milatory base";
		
		for (int i = 0; i < s.length(); i++) {
			
			char ch=Character.toLowerCase(s.charAt(i));
			
            if ((ch!='a')&&(ch!='e')&&(ch!='i')&&(ch!='o')&&(ch!='u')&& !Character.isWhitespace(s.charAt(i))) {
				
				System.out.println("consonent...."+ch);
			}
		}
	}

}
