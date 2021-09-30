import java.util.Scanner;

public class OperatorMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("키 :");
		double height = sc.nextDouble();

		System.out.print("나이 :");
		int age = sc.nextInt();

		System.out.println("===================");
		System.out.printf("키 %.1fcm , 나이 %d살\n", height, age);
//		논리연산자
//		!= 다른것 
//		== 같다
//		논리결합연산자
//		&& -> and		|| -> or		! -> not

//		키가 150cm 초과시 true 미만일 시 false
		boolean a = height > 150; // 괄호 쓰면 덜 헷갈릴수있음.
		System.out.println(a);

//		나이가 10살 이하시 true 10살 초과시 false
		boolean b = age <= 10; // 괄호 쓰면 덜 헷갈릴수있음.
		System.out.println(b);

//		나이가 5살 이상이고, 키가 2m이상
		boolean c = (age >= 5 && height >= 200);
		System.out.println(c);

//		키가 2m 이상이거나, 나이가 5살 이상
		boolean d = (height >= 200 || age >= 5);
		System.out.println(d);

//		d가 true면 e는 false , d가 false면 e는 true
		boolean e = !d;
		System.out.println(e);
	}

}
