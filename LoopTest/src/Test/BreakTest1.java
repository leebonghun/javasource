package Test;

public class BreakTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (true) { //무한루프
			int ran = (int) (Math.random() * 6) + 1;
			System.out.println(ran);
			if (ran == 6) {
				break;
			}
		}
	}

}
