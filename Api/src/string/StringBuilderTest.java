package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		
		String data = "ABC";
		data +="DEF";
		// TODO Auto-generated method stub
		
		//기존 문자열 제거한 후 새롭게 문자열 생성 => StringBuffer,StringBuilder 개선
		StringBuffer buffer = new StringBuffer();//멀티 스레드 지원
		StringBuilder builder = new StringBuilder();//단일 스레드 지원
		
		builder.append("ABC");
		builder.append("DEF");
		
		System.out.println(builder);
		
		builder.insert(3, "34");
		System.out.println(builder);
		
		builder.delete(1, 4);//4번자리는 포함안됨
		System.out.println(builder);
		
		String str1 = "Java Programming";
		StringBuilder builder1 = new StringBuilder(str1);
		builder1.append("123");
		builder1.insert(0, "JJJJJJJJ");
		System.out.println(builder1);
	}

}
