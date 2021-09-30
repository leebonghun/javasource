package ClassTest;

public class Numbers {
	private int num[];
	
	public Numbers(int num[]) {
		super();
		this.num = num;
	}
	//합계 = 반환타입 int,입력값은 없음
	
	int plus() {
		int total =0;
		for (int i = 0; i < num.length; i++) {
			total += num[i];
		}
		return total;
		
	}
	//평균 => 반환값은 double, 입력값은 없음
	double getAverage() {
		return (double)plus()/num.length;
	}
	
	
	
}
