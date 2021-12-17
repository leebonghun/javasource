package lambda;

import java.util.Arrays;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class StreamEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("딸기","사과","바나나","수박","사과","딸기");
		
		//distinct : 중복 제거 
		list.stream().skip(2) //2개 건너뛰고
		.limit(3) // 스트림의 요소는 최대 3개로 제한
		.forEach(System.out::println);
	}

}
