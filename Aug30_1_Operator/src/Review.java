import java.util.Scanner;

//비만 측정기
public class Review {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("***비만도 검사***");

		System.out.print("이름 :");
		String name = sc.next();

		System.out.print("키 :");
		double height = sc.nextDouble();

		System.out.print("몸무게 :");
		double weight = sc.nextDouble();

		System.out.println("===================");

		double avg = (height - 100) * 0.9;
		double biman = (weight / avg) * 100;
		String say = (biman > 120) ? "비만" : "정상";


		System.out.printf("표준체중 : %.2f\n", avg);
		System.out.printf("비만도 : %.2f%%\n", biman);
		System.out.printf("%s 씨는 %s 입니다", name, say);
		
		Thread.sleep(5000);
	}

}
