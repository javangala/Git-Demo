package test;

public class RemoveDuplicates {
	
    public static void main(String[] args) {
        String s = "aaabb cddd 2233eee fff44g";

        // Remove duplicates without using collections
        String result = removeDuplicates(s);

        System.out.println("Original string: " + s);
        System.out.println("String without duplicates: " + result);
    }

    private static String removeDuplicates(String input) {
        char[] charArray = input.toCharArray();
        int length = charArray.length;

        // Traverse the array and remove duplicates in-place
        int index = 0;
        for (int i = 0; i < length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (charArray[i] == charArray[j]) {
                	
                	
                    break;
                }
            }

            // If no duplicate is found, add the character to the result
            if (j == i) {
                charArray[index++] = charArray[i];
            }
        }

        // Create a new string with non-duplicate characters
        return new String(charArray, 0, index);
    }
}

