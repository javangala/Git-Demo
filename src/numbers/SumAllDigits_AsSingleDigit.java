package numbers;

public class SumAllDigits_AsSingleDigit {

	public static void main(String[] args) {
//		
//		int number = 651;
//		int reminder;
//        int sum = 0;
//
//        // Loop to extract and sum each digit
//        while (number > 0) {
//        	reminder=number % 10;
//            sum =sum+reminder ;   // Add the last digit to the sum
//            number /= 10;         // Remove the last digit
//        }
//
//        System.out.println("Sum of digits: " + sum);
//    }
//}
		
		int number = 651;
        int originalNumber = number;

        while (number > 9) {
            int sum = 0;
            int reminder;
            while (originalNumber > 0) {
            	reminder=originalNumber % 10;
                sum =sum+reminder ;
                originalNumber =originalNumber/ 10;
            }
            number = sum;//sum assign to number
            originalNumber = number; // Reset originalNumber for the next iteration
        }

        System.out.println("Single-digit result: " + number);
        
    }
}
