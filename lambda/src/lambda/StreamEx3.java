package lambda;

import java.util.Arrays;
import java.util.List;

public class StreamEx3 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("�ٵ�","dd","����","����","������");
		
		//�ٷ� �����ϴ� ���� ã�Ƽ� ���
		
		
//		for(String str:list) {
//			if(str.startsWith("��")) {
//				System.out.println(str);
//			}
//		}
		//filter : ���ǿ� �´� ��� ã��
		list.stream().filter(s->s.startsWith("��")).forEach(System.out::println);
	}
}
