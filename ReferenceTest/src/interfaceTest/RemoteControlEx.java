package interfaceTest;

public class RemoteControlEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc; 
		rc = new Television();
		//rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		System.out.println();
		
		
		
//		rc.turnOn();
//		rc.setVolume(5);
//		rc.turnOff();
	
	RemoteControl rc1 = new RemoteControl() {
		
		private int volume;

		@Override
		public void turnOn() {
			// TODO Auto-generated method stub
			System.out.println("������ �մϴ�");
		}
		
		@Override
		public void turnOff() {
			// TODO Auto-generated method stub
			
			System.out.println("������ ���ϴ�");
		}
		
		@Override
		public void setVolume(int volume) {
			// TODO Auto-generated method stub
			if(volume > RemoteControl.MAX_VOLUME) {
				volume = RemoteControl.MAX_VOLUME;
			}else if(volume < RemoteControl.MIN_VOLUME) {
				volume = RemoteControl.MIN_VOLUME;
			}else {
				this.volume = volume;
			}
			System.out.println("����� ���� ���� : "+volume);
			
		}
	};
	rc1.turnOn();
	rc1.setVolume(5);
	rc1.turnOff();
	}

}
