package Test;

public class Exam1 {

	public static void main(String[] args) {

		while (true) {
			int ran = (int) (Math.random() * 6) + 1;
			int ran2 = (int) (Math.random() * 6) + 1;
			System.out.println("*********************************");
			System.out.println("첫번째 주사위는" + ran + "이 나왔습니다\t\t*");
			System.out.println("두번째 주사위는" + ran2 + "이 나왔습니다\t\t*");
			System.out.println("*********************************");

			if (ran + ran2 == 5) {
				break;
			}
		}
		System.out.println("***합이 5가 나와 프로그램을 종료합니다***");
	}

}
