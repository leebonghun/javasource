package Test;

import java.util.Scanner;

public class DoWhileTest3 {
	public static void main(String args[]) {
		//컴퓨터가 1~100사이의 정수를 임의로 선정
		//사용자는 컴퓨터가 가지고 있는 숫자가 무엇이지 알아맞추기
		int ran = (int)(Math.random()*10)+1;
		
		Scanner sc =  new Scanner(System.in);
		int score;
		
		do {
			System.out.print("숫자를 입력하세요 :");
			score = sc.nextInt();
			if(score > ran) {
				System.out.println("다운");
			}
			else if(score<ran) {
				System.out.println("업");
			}
		} while (score !=ran);
		
		System.out.println("맞추셨습니다");
		
	}
}
