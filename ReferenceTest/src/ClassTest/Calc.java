package ClassTest;

//���� Ŭ���� ���� �ٸ� �޼ҵ� ȣ��
public class Calc {
//	���� 
//	���

	int plus(int x, int y) {
		return x + y;
	}

	double avg(int x, int y) {

		// return plus(x, y)/2;
		int sum = (plus(x, y)) / 2;
		return sum;
	}

	void execute() {
		double result = avg(7, 10);
		println("������" + result);
	}

	void println(String msg) {
		System.out.println(msg);
	}
}
