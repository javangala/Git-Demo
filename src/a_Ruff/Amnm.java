package a_Ruff;

public class Amnm {

	public static void main(String[] args) {
		String s1="TestingTempAutomation";
		String s2="TestingTempAutomation";
		
		String s3=new String("TestingTempAutomation");
		
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s2==s3);
		System.out.println(s3.equals(s2));


	}
}
