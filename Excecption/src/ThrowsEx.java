
public class ThrowsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			findClass();
		}catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지않습니다");
			e.printStackTrace();
		}
	}
	public static void findClass() throws ClassNotFoundException {
		Class.forName("asds");
		
	}

}
