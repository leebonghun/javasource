package exam;

import java.util.Scanner;

public class SwitchTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i < 4; i++) {
			System.out.print("가위 1 바위 2 보 3 :");
			int game = sc.nextInt();

			int ran = (int) (Math.random() * 3) + 1;
			// 0~2 + 1 = 1~3

			switch (game - ran) {
			case 1:
			case -2:
				System.out.println("당신이 이겼습니다");
				break;
			case 2:
			case -1:
				System.out.println("당신이 졌습니다");
				break;
			case 0:
				System.out.println("비겼습니다");
				break;
			default:
				break;
			}
		}
	}

}
