package string;

public class StringBuilderTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hello java!!!";

		char[] chArr = str1.toCharArray();

		for (int i = chArr.length - 1; i >= 0; i--) {
			System.out.print(chArr[i]);
		}
		System.out.println();
		
		StringBuilder builder = new StringBuilder(str1);
		builder.reverse();
		System.out.println(builder);

	}

}
