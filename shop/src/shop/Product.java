package shop;

public abstract class Product {
	// 반추상 : 일반 클래스와 동일한데 , 추상메서드도 가지고 있는상태
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
		System.out.println("상품명 :"+this.pname);
		System.out.println("가격 :"+this.price);
		printExtra();
	}

	public abstract void printExtra();

}
