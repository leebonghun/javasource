package ClassTest;

import java.util.Set;

public class SubscriberInfoEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubscriberInfo sub = new SubscriberInfo("dlqhdgns", "123", "010-5232-2054", "김포시");
		
		System.out.println(sub.getId());
		System.out.println(sub.getPw());
		System.out.println(sub.getTel());
		System.out.println(sub.getAddress());
		
		sub.setPw("1234");
		sub.setTel("010-2323-2323");
		sub.setAddress("경기도 인천");
		
		System.out.println(sub.getId());
		System.out.println(sub.getPw());
		System.out.println(sub.getTel());
		System.out.println(sub.getAddress());
		
	}

}
