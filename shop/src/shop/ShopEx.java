package shop;

public class ShopEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyShop shop = new MyShop();
		
		//상점 이름
		
		shop.setTitle("봉's SHOP");
		//고객 생성
		shop.genUser();
		//제품 생성
		shop.genProduct();
		//상점 시작
		shop.start();
		
	}

}
