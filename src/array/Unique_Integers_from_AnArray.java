package array;

import java.util.Arrays;

public class Unique_Integers_from_AnArray {
	
	    public static void main(String[] args) {
	        
	        int[] numbers = {1, 1, 2, 2, 3, 8, 2, 5};
	        
	        boolean[] b = new boolean[numbers.length];
	        Arrays.fill(b, false);
	        
	        for (int i = 0; i < numbers.length; i++) {
	            
	            if (!b[i]) {
	                
	                for (int j = i + 1; j < numbers.length; j++) {
	                    
	                    if (numbers[i] == numbers[j]) {
	                        b[j] = true;
	                    }
	                }
	                System.out.println(numbers[i]);
	            }
	        }       
	    }
	}


