package inheritance;

public class DmbCellPhone extends CellPhone {
	int channel;
	
	void turnOnDmb() {
		System.out.println("ä�� "+channel+" �� dmb ��� ����");
	}
	void turnOffDmb() {
		System.out.println("ä�� "+channel+" �� dmb ��� ����");
	}
	void changeChannelDmb(int channel) {
		System.out.println("ä�� "+channel+" �� ����");
	}
}
