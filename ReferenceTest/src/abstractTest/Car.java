package abstractTest;

/* 추상클래스 : 
 * 추상 : 구체적인 내용은 배제하고 공통된 부분만을 만들어주는 작업
 * 
 */

public abstract class Car {
	
	private String color;
	
	public Car(String color) {
		super();
		this.color = color;
	}

	public void start() {
		System.out.println("자동차 출발");
	}
	
	abstract void drive();
	abstract void stop();
}
