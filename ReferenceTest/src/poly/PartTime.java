package poly;


public class PartTime extends Employee{
	
	@Override
	public void work() {
		System.out.println(super.getPosition()+"에서"+super.getName()+"가 일함");
	}

}
