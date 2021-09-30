package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysEx3 {

	public static void main(String[] args) {
		List<String> list =Arrays.asList("apple","»ç°ú","ÀÌºÀÈÆ");
		
		
		
		List<String> list1 = new ArrayList<String>();
		list1.add("apple");
		list1.add("»ç°ú");
		list1.add("lemon");
		System.out.println(list1);
		
		List<Integer> list2 =new ArrayList<>(Arrays.asList(1,2,3,4,5));
		list2.add(6);
		System.out.println(list2);
	}

}
