package sample;

public class Sample {
	
	int cost;//instance variable
	static int wheels=4;//static variable
	public void ab() {
		int milage;//local variable
		
		
	}
	public static void main(String[] args) {
		
		Sample s=new Sample();
		s.cost=89;
		
		System.out.println(milage);//we can't able to call local variables
		System.out.println(s.cost);
		
		
		System.out.println(wheels);
	}
	
}
