package sample;

public class Car {


	int cost;
	int milage;
	static int wheels=4;

	public void methodX() {
		//non static method can access static and non static variables and methods directly
		System.out.println(wheels);
		System.out.println(cost);
		System.out.println(milage);
		methodZ();
		
		

	}
	public static void  methodZ() {

	}
	public static void methodY() {
		//static can access directly static stuff 
		System.out.println(wheels);

		//for non static variable and method we can acces through instance of class
		Car car=new Car();
		System.out.println(car.cost);
		System.out.println(car.milage);
		System.out.println(wheels);
		car.methodX();

	}

}
