package inheritance;

public class PolyEx {

	public static void main(String[] args) {
		//��ĳ����
		Parent2 p2 = new Child3();
		
		p2.field1="";
		p2.method1();
		p2.method2(); //�������̵� �� ���¶�� �ڽ� Ŭ������ �޼ҵ尡 �����
		
		//method3����?
		Child3 c = (Child3)p2;
		c.method3();

//		java.lang.ClassCastException			
//		Parent2 obj = new Parent2();
//		Child3 c2 = (Child3)obj;
//		c2.method3();
	}

}
