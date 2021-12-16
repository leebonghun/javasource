package lambda;

public class LambdaEx1 {

	public static void main(String[] args) {
		LambdaTest1 obj = ()-> System.out.println("함수형 인터페이스 람다");
		obj.method1();
		
		
		obj = ()-> {
			int i=10;
			System.out.println(i*i*i);
		};
		obj.method1();
		
	}

}
