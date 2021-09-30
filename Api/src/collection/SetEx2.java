package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> set = new HashSet<Integer>();
		Math.random();
		while(set.size()<6) {
			int lotto = (int)(Math.random()*45)+1;
			set.add(lotto);
			}
		System.out.println(set);
	}

}
