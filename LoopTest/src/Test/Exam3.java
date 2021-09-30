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
			System.out.println("1.예금 || 2.출금 || 3.잔고 || 4.종료");
			System.out.println("*******************************");
			System.out.print("선택 >>>");
			int select = sc.nextInt();
			
			if(select ==1) {
				System.out.print("예금 금액 입력 : ");
				balance=sc.nextInt();
			}
			else if(select ==2) {
				System.out.print("출금 금액 입력 :");
				balance2=sc.nextInt();
				balance2 = balance-balance2;
			}
			else if(select ==3) {
				System.out.println("잔고 :"+balance2+"원");
			}
			else if(select ==4) {
				run =false;
				System.out.println("종료합니다");
				
			}
		}
		
	}

}
