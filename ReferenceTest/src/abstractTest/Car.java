package abstractTest;

/* �߻�Ŭ���� : 
 * �߻� : ��ü���� ������ �����ϰ� ����� �κи��� ������ִ� �۾�
 * 
 */

public abstract class Car {
	
	private String color;
	
	public Car(String color) {
		super();
		this.color = color;
	}

	public void start() {
		System.out.println("�ڵ��� ���");
	}
	
	abstract void drive();
	abstract void stop();
}
