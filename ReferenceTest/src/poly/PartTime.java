package poly;


public class PartTime extends Employee{
	
	@Override
	public void work() {
		System.out.println(super.getPosition()+"����"+super.getName()+"�� ����");
	}

}
