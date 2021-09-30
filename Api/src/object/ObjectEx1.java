package object;

public class ObjectEx1 {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();

		// equals

		//System.out.println(obj1.equals(obj2));
		// boolean 리턴값이 존재함
		Value value1 = new Value(10);
		Value value2 = new Value(10);
		System.out.println(value1.equals(value2));
		//object가 넘겨주는 equals는 주소 비교 상수 비교가 아님 그래서
		//위에 문장은 false 가 출력 됨
	}

}
