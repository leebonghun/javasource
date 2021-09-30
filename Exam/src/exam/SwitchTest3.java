package exam;

public class SwitchTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = (int)(Math.random()*4)+8;
		//0~4 + 8 = 8~12
		
		switch (time) {
		case 8:
			System.out.println("출근을 합니다");
			break;
		case 9:
			System.out.println("회의를 합니다");
			break;
		case 10:
			System.out.println("업무를 합니다");
			break;
		
		default:
			System.out.println("외근을 합니다");
			break;
		}
	}

}
