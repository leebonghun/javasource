package string;

public class IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "�ڹ� ���α׷���";
		
		int index = str1.indexOf("���α׷���");
		System.out.println(index);
		
		String str2 = "Hellohellohello world";
		System.out.println(str2.indexOf(65));//��ã���� -1�� ��µȴ�.
		System.out.println(str2.indexOf("el",2));//el�� �ι�° ��ġ���� ã����� ��
		
		//�װ� ����ִ��� Ȯ��
		
		
		System.out.println(str1.indexOf("��")); //�װ� ������ ��� �װ� ������ -1���
		
	}

}
