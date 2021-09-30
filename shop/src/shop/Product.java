package shop;

public abstract class Product {
	// ���߻� : �Ϲ� Ŭ������ �����ѵ� , �߻�޼��嵵 ������ �ִ»���
	private String pname;
	private int price;

	public Product(String pname, int price) {
		super();
		this.pname = pname;
		this.price = price;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void printDetail() {
		System.out.println("��ǰ�� :"+this.pname);
		System.out.println("���� :"+this.price);
		printExtra();
	}

	public abstract void printExtra();

}
