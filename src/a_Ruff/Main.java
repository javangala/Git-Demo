package a_Ruff;
public class Main {
    public static void main(String[] args) {
        String input = "Ravindra Bollu";
        
        // Find the last space in the input string
        int lastIndex = input.lastIndexOf(" ");
        
        // Extract the substring after the last space
        String result = input.substring(lastIndex + 1);
        
        // Print the result
        System.out.println(result);
    }
}
