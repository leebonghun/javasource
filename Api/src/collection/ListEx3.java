package collection;

import java.util.ArrayList;
import java.util.List;

import javax.swing.event.ListSelectionEvent;

public class ListEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Member> list  = new ArrayList<>();
		
		list.add(new Member("hong", "hong1234", "¿Ã∫¿»∆"));
		list.add(new Member("hong1", "hong12345", "¿Ã∫¿»∆1"));
		list.add(new Member("hong2", "hong12346", "¿Ã∫¿»∆2"));
		list.add(new Member("hong3", "hong12347", "¿Ã∫¿»∆3"));
		System.out.println(list);
		
		System.out.println();
		
		for(Member eMember : list) {
			System.out.println(eMember);
		}
	}

}
