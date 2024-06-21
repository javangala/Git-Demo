package a_Ruff;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Sampl2 {

	public static int main(int n) {
		int factor10=1;
		int result=0;
		while (n!=0) {
			int digit = n % 10;
			digit*=digit;
			n/= 10;
			result += digit*factor10;
			factor10*= digit<10? 10 : 100;
		}
		return result;
	}
	public class SquareDigitTest {
		@Test
		public void test() {
			assertEquals(811181, new SquareDigit().squareDigits(9119));
			assertEquals(0, new SquareDigit().squareDigits(0));
		}
	}
}
