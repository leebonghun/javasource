package string;

public class Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abcdefg";
		String str2 = "ABCDEFG";

		// ��ҹ��� �������������� ���ϱ�
		System.out.println(str1.equalsIgnoreCase(str2));
		str1 = str1.toUpperCase(); // �ƿ� ���� �����Ϸ��� ��ƶ�
		System.out.println(str1.toUpperCase());
		System.out.println(str1);
		System.out.println(str2.toLowerCase());
	}

}
