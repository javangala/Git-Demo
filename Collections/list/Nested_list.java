package list;

import java.util.ArrayList;
import java.util.List;

public class Nested_list {
	
	public static void main(String[] args) {
		
		List<Object> nes=new ArrayList<Object>();
		
		nes.add("ma ,ba ,ca ");
		System.out.println(nes);
		
		List<String> Inner_List=new ArrayList<String>();
		
		Inner_List.add("bl");
		Inner_List.add("ml");
		Inner_List.add("bdl");
		System.out.println(Inner_List);
		
		nes.add(Inner_List);
		
		System.out.println(nes);
		

	}

}
