package abstractTest;

public class AiCarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AiCar ai = new AiCar("black");
		
		ai.start();
		ai.drive();
		ai.stop();
		
		//추상클래스는 객체 생성 불가
		// Car car = new Car();
		
		Car car = new AiCar("white");
		car.start();
		car.drive();
		car.stop();
			
	}

}
