package exam;

import java.util.Scanner;

public class SwitchTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("x :");
		int x = sc.nextInt();
		System.out.print("y :");
		int y = sc.nextInt();

		System.err.print("연산자 입력 : ");
		String z = sc.next();

		switch (z) {
		case "+":
			System.out.println(x + y);
			break;
		case "-":
			System.out.println(x - y);
			break;
		case "*":
			System.out.println(x * y);
			break;
		case "/":
			System.out.println(x / y);
			break;
		case "%":
			System.out.println(x % y);
			break;
		default:
			
			break;
		}
	}

}
