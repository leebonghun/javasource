package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Member> set = new HashSet<Member>();
		
		//hashcode() / eqauls() => �Ѵٰ��ٸ� �������� �ʴ´�
		set.add(new Member("hong", "123", "ȫ�浿"));
		set.add(new Member("hong1", "1234", "ȫ�浿1"));
		set.add(new Member("hong2", "1235", "ȫ�浿2"));
		set.add(new Member("hong3", "123456", "ȫ�浿3"));
		set.add(new Member("hong", "123", "ȫ�浿"));
		for(Member v:set) {
			System.out.println(v+"  "+v.hashCode());
			
		}
	}

}	
