package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		
		String data = "ABC";
		data +="DEF";
		// TODO Auto-generated method stub
		
		//���� ���ڿ� ������ �� ���Ӱ� ���ڿ� ���� => StringBuffer,StringBuilder ����
		StringBuffer buffer = new StringBuffer();//��Ƽ ������ ����
		StringBuilder builder = new StringBuilder();//���� ������ ����
		
		builder.append("ABC");
		builder.append("DEF");
		
		System.out.println(builder);
		
		builder.insert(3, "34");
		System.out.println(builder);
		
		builder.delete(1, 4);//4���ڸ��� ���Ծȵ�
		System.out.println(builder);
		
		String str1 = "Java Programming";
		StringBuilder builder1 = new StringBuilder(str1);
		builder1.append("123");
		builder1.insert(0, "JJJJJJJJ");
		System.out.println(builder1);
	}

}
