package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {
/*Set : 중복 허용하지 않음, 순서가 없음
 *    : 구현 클래스 - HashSet , TreeSet
 * 
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set1 = new HashSet<String>();
		HashSet<String> set2 = new HashSet<String>();
		
		set1.add("java");
		set1.add("jsp");
		set1.add("oracle");
		set1.add("html");
		
		System.out.println(set1);//순서 보장 x
		
		for(String string : set1) {
			System.out.println(string);
		}
		
		set2.add("1");
		set2.add("2");
		set2.add("3");
		set2.add("4");
		set2.add("1");//set은 중복값을 담지 않음
		System.out.println(set2);
	}

}
