package lambda;

import java.util.HashMap;
import java.util.Map;

public class ForEachEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> items = new HashMap<String, Integer>();
		items.put("A", 10);
		items.put("B", 80);
		items.put("C", 70);
		items.put("D", 60);
		items.put("E", 50);
		items.put("F", 40);
		items.put("G", 30);
		items.put("H", 20);
		
		for(Map.Entry<String, Integer> entry :items.entrySet()) {
			System.out.println("Item : "+entry.getKey()+", Count : "+entry.getValue());
		}
		
		System.out.println();
		
		items.forEach((k,v) -> System.out.println("Item : "+k+", Count : "+v));
	}

}
