package ClassTest;

public class Numbers {
	private int num[];
	
	public Numbers(int num[]) {
		super();
		this.num = num;
	}
	//�հ� = ��ȯŸ�� int,�Է°��� ����
	
	int plus() {
		int total =0;
		for (int i = 0; i < num.length; i++) {
			total += num[i];
		}
		return total;
		
	}
	//��� => ��ȯ���� double, �Է°��� ����
	double getAverage() {
		return (double)plus()/num.length;
	}
	
	
	
}
