package object;

public class SmartPhone {
	private String company;
	private String os;
	public SmartPhone(String company, String os) {
		super();
		this.company = company;
		this.os = os;
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+company + " ," + os+"]";
	}
	
}
