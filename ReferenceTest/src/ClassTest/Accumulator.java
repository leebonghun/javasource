package ClassTest;

public class Accumulator {
	static {
		try {
			Class.forName("");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//�ʱ�ȭ��
	
	int total = 0;
	static int grandTotal = 0;
	void accumulate(int amount) {
		total += amount;
		grandTotal +=amount;
	}
	
	static void print() {
		grandTotal = 10000;
	}
	
}
