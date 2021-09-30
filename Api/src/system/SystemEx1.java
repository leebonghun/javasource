package system;

public class SystemEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(i+"\t");
			
			if(i==5) {
				System.exit(0);
			}
		}
	}

}
