package lambda;

import java.util.Arrays;
import java.util.List;

public class FromCollectionEx1 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("���","�ٳ���","����","����","�޷�");
		
		list.stream().forEach(str->System.out.println(str));
		
	}

}
