import java.util.Scanner;

public class Review3 {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.print("가격: ");
		int price = sc.nextInt();
		System.out.print("낸 돈");
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
		System.out.println("거스름돈: " + money2);
		System.out.println("10000원권: " + a + "장");
		System.out.println("5000원권: " + b + "장");
		System.out.println("1000원권: " + c + "장");
		System.out.println("500원권: " + d + "장");
		System.out.println("100원권: " + e + "장");
		System.out.println("50원권: " + f + "장");
		System.out.println("10원권: " + g + "장");
		Thread.sleep(5000);
	}

}
