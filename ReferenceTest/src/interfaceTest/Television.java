package interfaceTest;

public class Television implements RemoteControl ,Searchable{

	private int volume;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("tv�� �մϴ�");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("tv�� ���ϴ�");
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
		System.out.println("���� ���� : "+volume);
	}

	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url+"�˻�");
	}
}
