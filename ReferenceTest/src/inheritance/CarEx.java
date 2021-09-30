package inheritance;

public class CarEx {

	public static void main(String[] args) {
		FireEngine f;
		Ambulance a;

		// f=a; <- 상속관계가 아닌 클래스간의 형변환 불가

		f = new FireEngine();
		Car car = f; // 상속관계는 형변환 가능 -> 업캐스팅

		FireEngine f2;
		f2 = (FireEngine) car; // 다운캐스팅 ->형변환 생략 불가
		f2.water();

	}

}
