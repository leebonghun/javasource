package ClassTest;

public class GoodsStockEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodsStock product1 = new GoodsStock();
		product1.code="p12345";
		product1.stockNum = 30;
		
		
		System.out.println("현재 재고수량 : "+product1.subtrackStock(15));
		
		product1.addStock(5);
		System.out.println("현재 재고수량 : "+product1.getStockNum);
		
	}

}
