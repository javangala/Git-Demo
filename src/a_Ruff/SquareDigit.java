package a_Ruff;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class SquareDigit {

	public int squareDigits(int n) {
		// TODO Implement me

		int a=0;
		for(int i=1; i<=n; i++)
			for(int j=1; j<=n; j++)
				a=a+i*j;
		return a;

	}


	public class SquareDigitTest {
		@Test
		public void test() {
			assertEquals(811181, new SquareDigit().squareDigits(9119));
			assertEquals(0, new SquareDigit().squareDigits(0));
		}

	}
}