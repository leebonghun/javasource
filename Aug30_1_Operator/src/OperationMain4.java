import java.util.Scanner;

public class OperationMain4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int a = 3 << 2; // shift 연산
		System.out.println(a);
		
		System.out.print("이름 :");
		String name = sc.next();
		
		System.out.print("나이 :");
		int age = sc.nextInt();
		
		//.equls 가 힙영역 ,연산자라는것들은 stack 영역이 대상
		String say2 =(name.equals("홍길동"))? "어?야!!!" : "어서오세요";
		System.out.println(say2);
	
		
		// 20살 넘으면 안녕하세요 미만이면 나가
		// 삼항연산 조건식 ? 맞을때 값 : 틀릴때 값
		String say = (age >= 20) ? "안녕하세요" : "나가";
		System.out.println(say);
		
		String oe = (age%2==0) ? "짝" : "홀";
		System.out.println(oe);
	}

}
