package object;

public class ObjectEx1 {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();

		// equals

		//System.out.println(obj1.equals(obj2));
		// boolean ���ϰ��� ������
		Value value1 = new Value(10);
		Value value2 = new Value(10);
		System.out.println(value1.equals(value2));
		//object�� �Ѱ��ִ� equals�� �ּ� �� ��� �񱳰� �ƴ� �׷���
		//���� ������ false �� ��� ��
	}

}
