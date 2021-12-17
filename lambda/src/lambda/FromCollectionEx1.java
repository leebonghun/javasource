package lambda;

import java.util.Arrays;
import java.util.List;

public class FromCollectionEx1 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("사과","바나나","유과","조과","메론");
		
		list.stream().forEach(str->System.out.println(str));
		
	}

}
