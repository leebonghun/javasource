package exam;

import java.util.Scanner;

public class SwitchTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i < 4; i++) {
			System.out.print("���� 1 ���� 2 �� 3 :");
			int game = sc.nextInt();

			int ran = (int) (Math.random() * 3) + 1;
			// 0~2 + 1 = 1~3

			switch (game - ran) {
			case 1:
			case -2:
				System.out.println("����� �̰���ϴ�");
				break;
			case 2:
			case -1:
				System.out.println("����� �����ϴ�");
				break;
			case 0:
				System.out.println("�����ϴ�");
				break;
			default:
				break;
			}
		}
	}

}
