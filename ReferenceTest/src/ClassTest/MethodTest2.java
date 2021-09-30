package ClassTest;

public class MethodTest2 {
	int sum1(int num1, int num2) {
		int result = num1 + num2;
		return result;
		//return num1 + num2
	}
	
	void print99dan() {
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\t\n",i,j,i*j);
				
			}
			
		}
	}
	int sum2(int num3, int num4) {
		return num3 * num4;
	}
}
