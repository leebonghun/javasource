
public class CheckedException {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		try {
			String data1 = args[0];
			String data2 = args[1];
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			System.out.println(value1 + value2);
			
		
		}catch (ArrayIndexOutOfBoundsException|NumberFormatException e) {
			System.out.println("�Ұ�");
			System.out.println("���ڷ� ���T �Ұ�");
		}finally {
			System.out.println("�ٽ� ���� ��Ű����");
		}
	}

}
