package a_Ruff;
public class CommonCharsVerifier {

    public static void main(String[] args) {
        String s = "Listen Silent";
        String[] words = s.split(" ");

        System.out.println(words.length);
        if (words.length == 2) {
            String word1 = words[0];
            String word2 = words[1];

            if (areCommonCharsPresent(word1, word2)) {
                System.out.println("Common characters are present in both words.");
            } else {
                System.out.println("No common characters found in both words.");
            }
        } else {
            System.out.println("Invalid input string. Please provide two words separated by space.");
        }
    }

    private static boolean areCommonCharsPresent(String word1, String word2) {
        for (char c : word1.toCharArray()) {
            if (word2.contains(String.valueOf(c))) {
                return true;
            }
        }
        return false;
    }
}


/*
 * public class CommonCharsVerifier {

    public static void main(String[] args) {
        String s = "Listen Silent";
        String[] words = s.split("\\s+");

        if (words.length == 2) {
            String word1 = words[0];
            String word2 = words[1];

            if (areCommonCharsPresent(word1, word2)) {
                System.out.println("Common characters are present in both words.");
            } else {
                System.out.println("No common characters found in both words.");
            }
        } else {
            System.out.println("Invalid input string. Please provide two words separated by space.");
        }
    }

    private static boolean areCommonCharsPresent(String word1, String word2) {
        for (char c : word1.toCharArray()) {
            if (word2.contains(String.valueOf(c))) {
                return true;
            }
        }
        return false;
    }
}
*/
