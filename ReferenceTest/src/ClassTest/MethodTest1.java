package ClassTest;

import java.util.logging.Logger;

public class MethodTest1 {

	boolean isRedirect() {
		return false;
	}

	int sum() {
		return 3;
	}

	int multiply(int num1, int num2) {
		return num1 + num2;
	}

	long add(long num1, long num2) {
		return num1 + num2;
	}

	char method() {
		return 'C';
	}

	void method1() { // 넘기는 값 없음

	}

	int[] print(int arr[]) {
		return arr;
	}

	double divide(double a, double b) {
		return a / b;
	}

}
