package inheritance;

public class SubListString extends ListString {
	String name="������";
	
	@Override
	public void list() {		
		super.list(); //�θ��� list ȣ��
		System.out.println(name + " ���� Ŭ����");
	}
	
	public void writer() {
		//�θ� ������ �ִ� �̸� ���
		System.out.println(super.name);
		
		super.list();
	}
}




















