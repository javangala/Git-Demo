package array;

public class Sorting_using_BubleSort_StringArray {
	
		public static void main(String[] args) {
			
			
			String[]  s= {"b","m","c","b","a"};
			
			String temp="";
			for (int i = 0; i < s.length; i++) {
				for (int j = i+1; j < s.length; j++) {
					if (s[i].compareTo(s[j])>0) {
						temp=s[i];
						s[i]=s[j];
						s[j]=temp;
						
					}
				}
				System.out.println(s[i]);
			}
		}

	}