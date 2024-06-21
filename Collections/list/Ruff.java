package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ruff {

	public static void main(String[] args) {
		
		List<Object> li=new ArrayList<Object>();
		
		li.add("ma");
		li.add("ba");
		System.out.println(li);
		
		List<String> inner=new ArrayList<String>();
		
		inner.add("na ,ba ,va");
		
		li.add(inner);
		System.out.println(li);
		
		li.add(0, "qa");
		
		System.out.println(li);
		

		System.out.println("index of 'ba'::"+li.indexOf("ba"));
		
		System.out.println("size of lis  ::"+li.size());
	
		li.add("ja");
		System.out.println(li);
		
		li.addFirst("car");
		System.out.println(li);
		
		li.addLast("bike");
		System.out.println(li);
		
//		li.clear();	
	
//		System.out.println(li);
		
		
		System.out.println(li.hashCode());
				
		li.remove(5);
		System.out.println(li);

		
		li.removeFirst();
		System.out.println(li);
		
		li.removeLast();
		System.out.println(li);
		
		li.add("qa");
		System.out.println(li);
		
		Collections.replaceAll(li ,"qa" ,"QA");
		System.out.println(li);
		
		li.retainAll(inner);
		System.out.println(li);
		
		
		

		
	}
	
}
