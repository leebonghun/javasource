package string;

import javax.lang.model.element.Element;

public class CharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "�ڹ� ���α׷���";

		char ch = str1.charAt(3);
		System.out.println(ch);
		
		System.out.println();
		
		boolean flag = false;
		for (int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i) == '��') {
				flag = true;
				break;
			}
		}
		System.out.println(flag?"���� o ":"���� x ");
		String str2 = "hello java";
		for (int i = 0; i < str2.length(); i++) {
			System.out.println(i+" ��°\t"+str2.charAt(i));
		}
		
		//str2�� char �迭�� ���
		
		
		
	}

}
