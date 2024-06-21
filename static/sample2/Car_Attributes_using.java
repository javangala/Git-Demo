package sample2;

public class Car_Attributes_using {
	
	public static void main(String[] args) {
		
		Car c=new Car("Red" ,"Z",2012);
		
		System.out.println(c.getColor());
		System.out.println(c.getModel());
		System.out.println(c.getYear());

		c.setColor("Black");
		c.setModel("V");
		c.setYear(2011);
		
		System.out.println(c.getColor()+"   " +c.getModel()+"  "+c.getYear());
	}

	
}
