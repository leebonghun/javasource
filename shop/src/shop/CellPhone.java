package shop;

public class CellPhone extends Product {
	private String carrier;// ��Ż� ����

	public CellPhone(String pname, int price,String carrier) {
		super(pname, price);
		this.carrier = carrier;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printExtra() {
		// TODO Auto-generated method stub
		System.out.println("��Ż� ���� : "+carrier);
	
	}

}
