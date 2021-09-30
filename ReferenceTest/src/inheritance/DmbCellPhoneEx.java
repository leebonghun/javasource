package inheritance;

public class DmbCellPhoneEx {

	public static void main(String[] args) {
		DmbCellPhone phone = new DmbCellPhone();	
		
		
		phone.color="black";
		phone.model="자바폰";
		phone.channel=7;
		
		phone.powerOn();
		phone.turnOnDmb();
		phone.changeChannelDmb(8);
		phone.turnOffDmb();
		phone.bell();
		phone.sendVoice("안녕하세요");
		phone.receiveVoice("반가워요");
		phone.hangUp();
		

	}

}








