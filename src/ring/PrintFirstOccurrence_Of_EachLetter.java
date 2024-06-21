package ring;
public class PrintFirstOccurrence_Of_EachLetter {
    public static void main(String[] args) {
        String s = "national highway 16b d4";
        char[] ch = s.toCharArray();

        boolean[] b = new boolean[Character.MAX_VALUE + 1]; // Using an array to track occurrences

        for (int i = 0; i < ch.length; i++) {
            char currentChar = ch[i];

            if (!b[currentChar]) {
                System.out.println(currentChar + " first occurrence at index " + i);
                b[currentChar] = true;
            }
        }
    }
}
