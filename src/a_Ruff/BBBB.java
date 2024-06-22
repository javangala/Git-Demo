package a_Ruff;

public class BBBB {
	
	String s="baba sahel";
	public static void main(String[] args) {
		
		BBBB b=new BBBB();
		b.method();
		System.out.println(b.s);
		String temp=b.s;
		System.out.println(stringTOchrarray(temp));
	}
	public void method() {
		System.out.println("Good Night");
	}

	public static char[] stringTOchrarray(String s ) {
		
		char[] temp=s.toCharArray();
		return temp;
		
	}
}
