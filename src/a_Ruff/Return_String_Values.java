package a_Ruff;

public class Return_String_Values {
	public static void main(String[] args) {
		
		String result=getFormatted("XYZ", 25, "Chennai");		
		System.out.println(result);
		
	}
	
	public static String getFormatted(String name ,int age ,String City) {		
		return "Name :"+name +"\nAge :"+age +"\nCity :"+City;
		
	}

}
