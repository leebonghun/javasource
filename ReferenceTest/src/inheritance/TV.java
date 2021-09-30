package inheritance;

public class TV {
	// 속성(필드,멤버변수,프로퍼티) => 색상,전원상태,채널....
	String color; // red,blue,black....
	boolean power;    // on, off
	int channel;
	
	// 동작(메소드) => 채널 변경(증가,감소)하다/전원을 켜다/끄다
	void channelUp() {
		//channelUp 가 해야 하는 작업 작성 현재 채널 7 => 8,9,10....
		channel++;		
	}
	void channelDown() {
		//channelDown 이 해야 하는 작업 작성 현재 채널 7 => 6,5,4....
		channel--;
	}
	
	void power() {
		//power가 해야 하는 작업 on => off,  off => on
		power = !power;
	}
	
}




