package sample;

public class Demo_For_Car {
	
	public static void main(String[] args) {
		
		Car benz=new Car();
		benz.cost=200000;
		benz.milage=12;
		/* we can use static variable through class name */
		System.out.println(benz.cost+" "+benz.milage+" "+Car.wheels);
		
		
		Car audi=new Car();
		audi.cost=30000;
		audi.milage=10;
		System.out.println("cost of car.."+audi.cost+" milage .."+audi.milage+" wheels.."+Car.wheels);

	}

}
