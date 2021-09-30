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
			System.out.println("라디오를 켭니다");
		}
		
		@Override
		public void turnOff() {
			// TODO Auto-generated method stub
			
			System.out.println("라디오를 끕니다");
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
			System.out.println("오디오 현재 볼륨 : "+volume);
			
		}
	};
	rc1.turnOn();
	rc1.setVolume(5);
	rc1.turnOff();
	}

}
