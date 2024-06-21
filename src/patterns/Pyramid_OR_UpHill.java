package patterns;

public class Pyramid_OR_UpHill {

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

	}

}
