package poly;


public class Ceo extends Employee{
	
	@Override
	public void work() {
		System.out.println(super.getPosition()+"����"+super.getName()+"�� ����");
	}

}
