
public class ThrowsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			findClass();
		}catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ ���������ʽ��ϴ�");
			e.printStackTrace();
		}
	}
	public static void findClass() throws ClassNotFoundException {
		Class.forName("asds");
		
	}

}
