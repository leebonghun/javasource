package lambda;

import java.util.Arrays;
import java.util.List;

public class StreamEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("딸기","사과","바나나","수박","사과","딸기");
		
		//distinct : 중복 제거 
		list.stream().distinct().forEach(System.out::println);
	}

}
