package Test;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		boolean run =true;
		
		int balance =0;
		int balance2 =0;
		
		
		Scanner sc=new Scanner(System.in);
		
		while (run) {			
			System.out.println("*******************************");
			System.out.println("1.���� || 2.��� || 3.�ܰ� || 4.����");
			System.out.println("*******************************");
			System.out.print("���� >>>");
			int select = sc.nextInt();
			
			if(select ==1) {
				System.out.print("���� �ݾ� �Է� : ");
				balance=sc.nextInt();
			}
			else if(select ==2) {
				System.out.print("��� �ݾ� �Է� :");
				balance2=sc.nextInt();
				balance2 = balance-balance2;
			}
			else if(select ==3) {
				System.out.println("�ܰ� :"+balance2+"��");
			}
			else if(select ==4) {
				run =false;
				System.out.println("�����մϴ�");
				
			}
		}
		
	}

}
