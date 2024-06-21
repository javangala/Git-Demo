package patterns;

public class Dimond {


	public static void main(String[] args) {

		int rows=6;

		for (int i = 1; i <rows; i++) {
			for (int j = i; j <=rows; j++) {

				System.out.print("  ");
			}
			for (int k = 1; k <=i; k++) {

				System.out.print("* ");
			}
			for (int l = 1; l <i; l++) {

				System.out.print("* ");
			}
			System.out.println();
		}

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
