package ClassTest;

import javax.naming.spi.DirStateFactory.Result;

public class MethodTestEx {

	public static void main(String[] args) {
		MethodTest1 obj = new MethodTest1();
		MethodTest2 obj1 = new MethodTest2();

		// �޼ҵ� ȣ��� ���ϵǴ� ���� �ִ� ���
//		1. print() �� ó���ϴ¹�� 
		 System.out.println(obj.isRedirect());
//		2. ���ϵǴ� �� �ޱ� result�� false�� ��
		 boolean result= obj.isRedirect();
//		result�� �̿��ؼ� �ڵ� �ۼ�
		 
		 System.out.println(obj1.sum1(10,10));
		 System.out.println(obj1.sum2(9, 9));
		
		 obj1.print99dan();
		 
		
	}

}
