package lambda;

import java.util.Arrays;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class StreamEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("����","���","�ٳ���","����","���","����");
		
		//distinct : �ߺ� ���� 
		list.stream().skip(2) //2�� �ǳʶٰ�
		.limit(3) // ��Ʈ���� ��Ҵ� �ִ� 3���� ����
		.forEach(System.out::println);
	}

}
