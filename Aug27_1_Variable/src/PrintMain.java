import java.util.Scanner;

public class PrintMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("제품명 :");
		String name = sc.next();

		System.out.print("가격 :");
		int price = sc.nextInt();

		System.out.print("무게 :");
		double size = sc.nextDouble();
		
//		형식지정
//			%s %d %f %b , 문자 정수 실수 불린
//			%05d : 자리수 맞추기
//			%.3f : 반올림 해서 소수점 세자리 까지
//			%% : %가 글자로 추력
		System.out.println("=========================");
		System.out.printf("제품명 :%s\n", name);
		System.out.printf("가격 :%05d원\n", price);
		System.out.printf("무게 :%.2f kg\n", size);
		double pct = 88.6;
		System.out.printf("%.2f%%\n", pct);
		System.out.printf("[%s]\n[%d원]\n[%.3fkg]",name,price,size);

	}

}
