package abstractTest;

public class AiCarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AiCar ai = new AiCar("black");
		
		ai.start();
		ai.drive();
		ai.stop();
		
		//�߻�Ŭ������ ��ü ���� �Ұ�
		// Car car = new Car();
		
		Car car = new AiCar("white");
		car.start();
		car.drive();
		car.stop();
			
	}

}
