package Practice;

import Practice.ListString;

public class SubListString extends ListString {
	
	String name = "성춘향  ";
	@Override
	public void List() {
		super.List(); //부모의 리스트를 호출해주는것.....
		System.out.println(name+"하위 클래스");
	}
	public void writer() {
		System.out.println(super.name);
		
		List();
	}//super라는 키워드는 부모를 가리킴
}
