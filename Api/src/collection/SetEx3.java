package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Member> set = new HashSet<Member>();
		
		//hashcode() / eqauls() => 둘다같다면 저장하지 않는다
		set.add(new Member("hong", "123", "홍길동"));
		set.add(new Member("hong1", "1234", "홍길동1"));
		set.add(new Member("hong2", "1235", "홍길동2"));
		set.add(new Member("hong3", "123456", "홍길동3"));
		set.add(new Member("hong", "123", "홍길동"));
		for(Member v:set) {
			System.out.println(v+"  "+v.hashCode());
			
		}
	}

}	
