package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachEx1 {

	public static void main(String[] args) {
		//forEach : for문을 함수적 스타일로 사용 / 요소를 하나씩 꺼내기
		
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
