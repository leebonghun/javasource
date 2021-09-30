package Test;

public class ForTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int plus = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 3 == 0 && i % 9 != 0) {
				plus = plus + i;
			}
		}
		System.out.println(plus);
		System.out.println("=====================");
		int plus1 = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				plus1 = plus1 + i;
			}
		}
		System.out.println(plus1);
	}

}
