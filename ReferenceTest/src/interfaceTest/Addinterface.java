package interfaceTest;

/* 1) ��� �ʵ常 ����
 * 2) �߻� �޼ҵ常 ����
 * 
 * 
 */

public interface Addinterface {
	public static final int x = 100;
	

	void method1();
	
	//1.8���� static�޼ҵ��default �޼ҵ� ���� �� ����

	static void method2() {
		
	}
	default void method3() {
		
	}
}
