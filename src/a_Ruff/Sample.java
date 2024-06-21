package a_Ruff;

public class Sample {
	
	
	
	public static void main(String[] args) {
		int n=242;
		int number=0;
		String nStr = Integer.toString(n);
		String temp = "";
        // Print each digit on a new line
        for (int i = 0; i < nStr.length(); i++) {
        	number=Character.getNumericValue(nStr.charAt(i));
            //System.out.println(number);
            number=number*number;
            System.out.println(number);
            String finalVal=Integer.toString(number);
            number=0;
            temp=temp.concat(finalVal);
        }
		
        System.out.println("Final value ::: "+temp);
		
        int nu=Integer.parseInt(temp);
        
        System.out.println(nu);
        
	}
	

}
