import java.util.Scanner;

public class Review2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("***BMI***");
		System.out.print("�̸� :");
		String name = sc.next();
		System.out.print("Ű : ");
		double height = sc.nextDouble();
		System.out.print("ü�� : ");
		double weight = sc.nextDouble();

		double bmi = weight / (height * height);
		System.out.printf("%s�� BMI������ %.2f�Դϴ�\n", name, bmi);

		System.out.println("===================");

		if (bmi >= 35) {
			System.out.println("���Դϴ�");
		} else if (bmi >= 30 && bmi < 34.9) {
			System.out.println("�ߵ� ��(2�ܰ� ��)�Դϴ�");
		} else if (bmi >= 25 && bmi < 29.9) {
			System.out.println("�浵 ���Դϴ�");
		} else if (bmi >= 23 && bmi < 24.9) {
			System.out.println("��ü�� �Դϴ�");
		} else if (bmi >= 18.5 && bmi < 22.9) {
			System.out.println("���� �Դϴ�");
		} else {
			System.out.println("��ü�� �Դϴ�");
		}
		
		Thread.sleep(5000);

	}

}
