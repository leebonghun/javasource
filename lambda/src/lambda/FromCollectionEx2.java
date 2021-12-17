package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FromCollectionEx2 {

	public static void main(String[] args) {
		List<Student> stuList = new ArrayList<Student>();
		stuList.add(new Student("홍길동", 40));
		stuList.add(new Student("장길동", 30));
		stuList.add(new Student("황길동", 50));
		stuList.add(new Student("이길동", 10));
		
		stuList.stream().forEach(s->System.out.println(s.getName()+"   "+s.getJumsu()));
		
	}

}
