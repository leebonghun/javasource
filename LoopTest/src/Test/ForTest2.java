package Test;

import java.util.Scanner;

public class ForTest2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("단을 입력하세요 : ");
		int dan = sc.nextInt();
		
		for (int i = 1; i <=9; i++) {
			System.out.printf("%d * %d = %d\n",dan,i,(dan*i));
			
		}
		
		
		/*int sum = 0;
		for (int i = 2; i <=9; i++) {
			for (int j = 1; j <=9; j++) {
				sum = i*j;	
				System.out.printf("%d * %d = %d\n",i,j,sum);
			}
			
		}*/
		
		
	}
}
