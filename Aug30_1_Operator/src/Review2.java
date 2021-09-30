import java.util.Scanner;

public class Review2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("***BMI***");
		System.out.print("이름 :");
		String name = sc.next();
		System.out.print("키 : ");
		double height = sc.nextDouble();
		System.out.print("체중 : ");
		double weight = sc.nextDouble();

		double bmi = weight / (height * height);
		System.out.printf("%s의 BMI지수는 %.2f입니다\n", name, bmi);

		System.out.println("===================");

		if (bmi >= 35) {
			System.out.println("비만입니다");
		} else if (bmi >= 30 && bmi < 34.9) {
			System.out.println("중도 비만(2단계 비만)입니다");
		} else if (bmi >= 25 && bmi < 29.9) {
			System.out.println("경도 비만입니다");
		} else if (bmi >= 23 && bmi < 24.9) {
			System.out.println("과체중 입니다");
		} else if (bmi >= 18.5 && bmi < 22.9) {
			System.out.println("정상 입니다");
		} else {
			System.out.println("저체중 입니다");
		}
		
		Thread.sleep(5000);

	}

}
