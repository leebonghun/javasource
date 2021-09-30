package ClassTest;

import javax.naming.spi.DirStateFactory.Result;

public class MethodTestEx {

	public static void main(String[] args) {
		MethodTest1 obj = new MethodTest1();
		MethodTest2 obj1 = new MethodTest2();

		// 메소드 호출시 리턴되는 값이 있는 경우
//		1. print() 로 처리하는방법 
		 System.out.println(obj.isRedirect());
//		2. 리턴되는 값 받기 result에 false가 들어감
		 boolean result= obj.isRedirect();
//		result를 이용해서 코드 작성
		 
		 System.out.println(obj1.sum1(10,10));
		 System.out.println(obj1.sum2(9, 9));
		
		 obj1.print99dan();
		 
		
	}

}
