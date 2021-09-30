package collection;

import java.util.LinkedList;
import java.util.List;

/*ArrayList vs LinkedList
 * -순차적으로 추가/삭제 시 ArrayList가 좀 더 빠르다
 * -중간 데이터를 추가/삭제 시 LinkedList가 좀 더 빠름
 */
public class ListEx4 {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		
		//추가 할때는 add를 쓰면됨 그대로
		list.add("이봉훈");
		list.add("배");
		list.add("사과");
		list.add("복숭아");
		list.add("수박");
		
		System.out.println(list);
	}

}
