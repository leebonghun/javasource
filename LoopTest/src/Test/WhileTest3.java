package Test;

import java.io.IOException;

public class WhileTest3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		boolean run = true;
		int keyCode = 0, speed = 0;
		while (run) {
			//13 => CR && 10 => LF : ����
			if (keyCode != 13 && keyCode != 10) {
				System.out.println("1.���� 2.���� 3.����");
				System.out.print("���� : ");
			}
			keyCode = System.in.read();
			if (keyCode == 49) {
				speed++;
				System.out.println("���� �ӵ�" + speed);
			} else if (keyCode == 50) {
				speed--;
				System.out.println("���� �ӵ�" + speed);
			} else if (keyCode == 51) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}

}
