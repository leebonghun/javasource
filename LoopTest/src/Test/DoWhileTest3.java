package Test;

import java.util.Scanner;

public class DoWhileTest3 {
	public static void main(String args[]) {
		//��ǻ�Ͱ� 1~100������ ������ ���Ƿ� ����
		//����ڴ� ��ǻ�Ͱ� ������ �ִ� ���ڰ� �������� �˾Ƹ��߱�
		int ran = (int)(Math.random()*10)+1;
		
		Scanner sc =  new Scanner(System.in);
		int score;
		
		do {
			System.out.print("���ڸ� �Է��ϼ��� :");
			score = sc.nextInt();
			if(score > ran) {
				System.out.println("�ٿ�");
			}
			else if(score<ran) {
				System.out.println("��");
			}
		} while (score !=ran);
		
		System.out.println("���߼̽��ϴ�");
		
	}
}
