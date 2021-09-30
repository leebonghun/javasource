package string;

public class Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abcdefg";
		String str2 = "ABCDEFG";

		// 대소문자 ㅂ구별하지말고 비교하기
		System.out.println(str1.equalsIgnoreCase(str2));
		str1 = str1.toUpperCase(); // 아예 값을 변경하려면 담아라
		System.out.println(str1.toUpperCase());
		System.out.println(str1);
		System.out.println(str2.toLowerCase());
	}

}
