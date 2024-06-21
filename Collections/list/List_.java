package list;

import java.util.ArrayList;
import java.util.List;

public class List_ {
	
	public static void main(String[] args) {
		
//		List<Integer> Ili=new ArrayList<Integer>();
//		
//		Ili.add(113);
//		System.out.println(Ili);
//		
//		List<Double> li=new ArrayList<Double>();
//		
//		li.add(7.0);
//		li.add(6.0);
//		li.add(78.0);
//		li.add(7.0);
//		System.out.println(li);
//		
//		System.out.println(li.toString());
//		System.out.println(li.indexOf(6d));
		
		List<String> Sli=new ArrayList<String>();
		
		List<String> Sli2=new ArrayList<String>();
		
		List<String> Sli3=new ArrayList<String>();
		
		Sli2.add("bike");
		Sli2.add("car");
		System.out.println(Sli2);
		
		Sli.add("air");
		Sli.addFirst("water");
		System.out.println(Sli);

		Sli.add("ma ,ba ,ca ");		
		Sli.addAll(Sli2);
		
		System.out.println(Sli);
		Sli.subList(0, 1);
		System.out.println("sublist :::"+Sli);

		
		List<Object> nes = new ArrayList<>();

        // Creating a list of strings
        List<String> innerList = new ArrayList<>();
        innerList.add("ma");
        innerList.add("ja");
        innerList.add("va");

        // Adding the list of strings to the outer list
        nes.add(innerList);
		
		nes.add(Sli2);
		nes.add("test");
		System.out.println(nes);
		
		
	}

}
