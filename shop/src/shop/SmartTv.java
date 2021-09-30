package shop;

public class SmartTv extends Product {
	
	private String resolution;

	public SmartTv(String pname, int price,String resolution) {
		super(pname, price);
		this.resolution =resolution;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printExtra() {
		// TODO Auto-generated method stub
		System.out.println("해상도 정보  "+resolution);
	}

}
