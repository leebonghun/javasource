package Test;

public class ForTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * for (int i = 2; i <= 9; i++) { for (int j = 1; j <= 9; j++) {
		 * System.out.printf("%d * %d = %2d\t", i, j, (i * j)); } System.out.println();
		 * }
		 */

		/*
		 * for (int i = 1; i < 6; i++) { for (int j = 0; j < i; j++) {
		 * System.out.print("*"); } System.out.println(""); } System.out.println();
		 */

		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("====================");
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > 0; j--) {
				if (j > i) { //
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println("====================");

		for (int i = 6; i > 0; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print("*");
				
			}
			System.out.println("");
		}
		System.out.println("====================");

		for (int i = 6; i > 0; i--) {
			for (int j = 6; j > 0; j--) {
				if (j > i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}

	}

}
