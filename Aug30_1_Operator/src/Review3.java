import java.util.Scanner;

public class Review3 {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.print("����: ");
		int price = sc.nextInt();
		System.out.print("�� ��");
		int money = sc.nextInt();

		int money2;

		int a, b, c, d, e, f, g;

		money2 = money - price;

		a = money2 / 10000;
		b = (money2 % 10000) / 5000;
		c = (money2 % 5000) / 1000;
		d = (money2 % 1000) / 500;
		e = (money2 % 500) / 100;
		f = (money2 % 100) / 50;
		g = (money2 % 50) / 10;
		
		
		System.out.println("===============================");
		
		Thread.sleep(3000);
		System.out.println("�Ž�����: " + money2);
		System.out.println("10000����: " + a + "��");
		System.out.println("5000����: " + b + "��");
		System.out.println("1000����: " + c + "��");
		System.out.println("500����: " + d + "��");
		System.out.println("100����: " + e + "��");
		System.out.println("50����: " + f + "��");
		System.out.println("10����: " + g + "��");
		Thread.sleep(5000);
	}

}
