package patterns;

public class DownHill {

	public static void main(String[] args) {

		int rows=6;

		for (int i = 1; i <=rows; i++) {

			for (int j = 1; j <=i; j++) {
				System.out.print("  ");
			}

			for (int k = i; k <rows; k++) {
				System.out.print("* ");
			}

			for (int l = i; l <=rows; l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
