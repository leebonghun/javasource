package lambda;

import java.util.Arrays;

public class FromArrayEx1 {

	public static void main(String[] args) {
		//스트림 : 자바 8부터 추가
		//       컬렉션의 요소를 하나씩 참조해서 람다식으로 처리할 수 있도록 도와주는 반복자
		//       필터링, 매핑과 같은 중간 처리가 가능함
		//       코드의 간결성 유지, 요소의 병렬 처리를 컬렉션 내부에서 알아서 처리
		
		
		String[] strArray = {"사과","바나나","자몽","참외","메론",};
		
		//배열 -> stream
		//배열을 편리하게 사용할 수 있도록 제공되는 클래스 : Arrays
		
		//배열을 스트림으로 만드는 작업
		Arrays.stream(strArray).forEach(str -> System.out.println(str));
		
	}

}
