package exam;

public class SwitchTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = (int)(Math.random()*4)+8;
		//0~4 + 8 = 8~12
		
		switch (time) {
		case 8:
			System.out.println("����� �մϴ�");
			break;
		case 9:
			System.out.println("ȸ�Ǹ� �մϴ�");
			break;
		case 10:
			System.out.println("������ �մϴ�");
			break;
		
		default:
			System.out.println("�ܱ��� �մϴ�");
			break;
		}
	}

}
