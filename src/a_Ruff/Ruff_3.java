package a_Ruff;
import java.util.ArrayList;

public class Ruff_3 {
	
	public static void main(String[] args) {
		
		ArrayList < Integer > arraylist = new ArrayList < Integer > ();

		arraylist.add(10010);
		arraylist.add(5);
		arraylist.add(4);
		arraylist.add(2);

		for (int i = 0; i < arraylist.size(); i++) {

		    for (int j = arraylist.size() - 1; j > i; j--) {
		        if (arraylist.get(i) > arraylist.get(j)) {

		            int tmp = arraylist.get(i);
		            arraylist.get(i) = arraylist.get(j);
		            arraylist.get(j) = tmp;

		        }

		    }

		}
		for (int i: arraylist) {
		    System.out.println(i);
		}
		
	}

}



