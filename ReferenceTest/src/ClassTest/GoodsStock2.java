package ClassTest;

public class GoodsStock2 {
	//�Ӽ� : ��ǰ�� ������ ���(p12345),������(100)
	//��� : ������ ����(�Է°� ����,��¹��� ����), ������ ����
//	������ ����(�Է°� ����, ��°��� ���� ������)
	
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
	//���� �������� �����ϴ� ���
	int getStockNum() {
		return stockNum;
	}
	
	
}
