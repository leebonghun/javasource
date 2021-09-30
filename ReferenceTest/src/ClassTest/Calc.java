package ClassTest;

//같은 클래스 내에 다른 메소드 호출
public class Calc {
//	덧셈 
//	평균

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
		println("실행결과" + result);
	}

	void println(String msg) {
		System.out.println(msg);
	}
}
