package Test;

import java.util.Scanner;


public class DoWhileTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�޼����� �Է��ϼ���");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���");

		Scanner sc = new Scanner(System.in);
		String input;
		do {
			System.out.print("> ");
			input = sc.next();
			System.out.println(input);
			
		} while (!input.equals("q"));
		System.out.println("���α׷� ����");
	}

}
