package a_Ruff;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class PangramChecker {

	public boolean check(String sentence) {
		boolean isPangram = true;
		String regex = "^[a-zA-Z]*$";
		String cleanedSentence = sentence.replaceAll("\\s", "").toLowerCase();

		if (!cleanedSentence.matches(regex)) {
			isPangram = false;
		} else {
			for (char letter = 'a'; letter <= 'z'; letter++) {
				if (cleanedSentence.indexOf(letter) == -1) {
					isPangram = false;
					break;
				}
			}
		}

		return isPangram;
	}

	@Test
	public void test1() {
		String pangram1 = "The quick brown fox jumps over the lazy dog.";
		PangramChecker pc = new PangramChecker();
		assertEquals(true, pc.check(pangram1));
	}

	@Test
	public void test2() {
		String pangram2 = "You shall not pass!";
		PangramChecker pc = new PangramChecker();
		assertEquals(false, pc.check(pangram2));
	}
}
