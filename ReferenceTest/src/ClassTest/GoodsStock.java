package ClassTest;

public class GoodsStock {
	//�Ӽ� : ��ǰ�� ������ ���(p12345),������(100)
	//��� : ������ ����(�Է°� ����,��¹��� ����), ������ ����
//	������ ����(�Է°� ����, ��°��� ���� ������)
	
	String code;
	int stockNum;
	
	void addStock(int amount) {
		stockNum += amount;
	}
	int subtrackStock(int amount) {
		if(stockNum>amount) {
		 stockNum -=amount;
		}
		return stockNum;
	}
	
	
}
