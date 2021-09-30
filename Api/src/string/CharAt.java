package string;

import javax.lang.model.element.Element;

public class CharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "자바 프로그래밍";

		char ch = str1.charAt(3);
		System.out.println(ch);
		
		System.out.println();
		
		boolean flag = false;
		for (int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i) == '그') {
				flag = true;
				break;
			}
		}
		System.out.println(flag?"포함 o ":"포함 x ");
		String str2 = "hello java";
		for (int i = 0; i < str2.length(); i++) {
			System.out.println(i+" 번째\t"+str2.charAt(i));
		}
		
		//str2를 char 배열에 담고
		
		
		
	}

}
