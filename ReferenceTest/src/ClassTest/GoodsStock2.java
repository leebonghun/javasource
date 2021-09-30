package ClassTest;

public class GoodsStock2 {
	//속성 : 상품의 정보를 담기(p12345),재고수량(100)
	//기능 : 재고수량 증가(입력값 수량,출력밧은 없음), 재고수량 감소
//	재고수량 감소(입력값 수량, 출력값은 현재 재고수량)
	
	private String code;
	private int stockNum;
	
	GoodsStock2(){};
	
	GoodsStock2(String code, int stockNum){
		this.code = code;
		this.stockNum = stockNum;
	}
	
	void addStock(int amount) {
		stockNum += amount;
	}
	int subtrackStock(int amount) {
		if(stockNum>amount) {
		 stockNum -=amount;
		}
		return stockNum;
	}
	//현재 재고수량을 리턴하는 기능
	int getStockNum() {
		return stockNum;
	}
	
	
}
