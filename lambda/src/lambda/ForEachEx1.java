package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachEx1 {

	public static void main(String[] args) {
		//forEach : for���� �Լ��� ��Ÿ�Ϸ� ��� / ��Ҹ� �ϳ��� ������
		
		List<String> items = Arrays.asList("A","B","c","d");
		
		for(String item:items) {
			System.out.println(item);
		}
		System.out.println();
		
		items.forEach(item-> System.out.println(item));
		
		System.out.println();
		
		items.forEach(System.out::println);
	}

}
