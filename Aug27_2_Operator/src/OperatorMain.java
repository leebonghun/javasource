import java.util.Scanner;

public class OperatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("x: ");
		int x = sc.nextInt();

		System.out.print("y: ");
		int y = sc.nextInt();

		System.out.printf("x : %d y : %d\n", x, y);
//		산술 연산자 -> +,-,*,/,%
		int a = x + y;
		int b = x - y;
		int c = x * y;
		double d = (double) x / y;// 둘중에 하나라도 실수형으로 해줘야한다.
		String laugh = "ㅋ";
		String e = x + laugh;
		String bb = "차는" + b;// string + 숫자 = string숫자 형식으로 붙여져서 출력됨
		int f = x % y; // %는 나머지
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(bb);
		System.out.println(f);
//결합형 연산자(대입연산자 + 산술연산자)
//		+=
//		-=
//		*=
//		/=
//		%=
		x += 5;//x=x+5랑 똑같음     =는 맨 마지막에
		System.out.println(x);
		y -= 3;//y=y-3랑 똑같음     =는 맨 마지막에
		System.out.println(y);
//		증감연산자
//		++
//		--
//		x++ <=> x=x+1
	}
}
