package collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
//list(인터페이스) : 순서가 있다, 데이터의 중복 가능
	// 구현 클래스 : vector, stack, arraylist, linkedlist
//기본 탕비 => 객체 타입 (wrapper 클래스)
//int -< Integer float => Float , double => Double, 
	// char => character , boolean => Boolean

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<String>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		// 데이터 추가 => add()로 추가

		list1.add("이봉훈");
		list1.add("배");
		list1.add("사과");
		list1.add("복숭아");
		list1.add("수박");
		for (String e : list1) {
			System.out.println(e);
		}

		System.out.println(list1); // toString이 오버라이딩 되어 있음

		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));

		}
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		for (int v : list2) {
			System.out.println(v);
		}
		System.out.println();
		System.out.println(list2);
		System.out.println();
		int total =0;
		for (int i = 0; i < list2.size(); i++) {
			total += list2.get(i);
		}
		System.out.println(total	);
	}

}
