package sample;

class Holidays{

	public static String days="Summer Holidays";
	
	public static void test() {
		System.out.println("test method  "+Holidays.days);
	}
}

public class Value_Chang {

	void Thestatic() {

		Holidays.days="Pongal Holidays";
		System.out.println(Holidays.days);

	}

	public static void main(String[] args) {
		
		Value_Chang v=new Value_Chang();
		System.out.println(Holidays.days);
		v.Thestatic();

		Holidays.test();

	}
	
	/*
	 * why we use static block?
	 * 
	 * for constructor we need to create an object definitely .
	 * but for static we don't want to create object we can call directly
	 * it is  useful when we want load properties files, where you going to 
	 * read properties, during that time will be people using static block.that is
	 * one of scope people generally use static block
	 * */
	static {
		System.out.println(" this will be execute first");
	}


}


