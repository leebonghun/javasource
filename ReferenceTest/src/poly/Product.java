package poly;

public class Product {
	
	
	Object obj;
	private int price;
	private int bonusPoint;

	public Product(int price) {
		super();
		this.price = price;
		this.bonusPoint = (int) (price / 10.0);
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

}
