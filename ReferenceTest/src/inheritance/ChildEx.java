package inheritance;

public class ChildEx {
	public static void main(String[] args) {
		// Child ��ü ���� => 2����
		
		// ��ü ����
		// 
		// 1) super(); => Object ������ ȣ��
		// 2) this.age = age
		// 3) super(age);	=> Parent ������ ȣ��
		// 4) Child ��ü ����
		
		Child child = new Child(25);
		System.out.println("child age "+child.getAge());
		child.play();
		child.print();
		
		Parent parent = new Child(26);
		System.out.println("child age "+parent.getAge());
		// parent.play(); ���θ�
		parent.print();
		
	}
}








