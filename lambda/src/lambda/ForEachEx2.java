package lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEachEx2 {

	public static void main(String[] args) {
		List<Student> stuList = new ArrayList<Student>();
		stuList.add(new Student("홍길동", 40));
		stuList.add(new Student("장길동", 30));
		stuList.add(new Student("황길동", 50));
		stuList.add(new Student("이길동", 10));
		
		for (Student student : stuList) {
			System.out.println(student.getName()+"  "+student.getJumsu());
		}
		
		System.out.println();
		
		stuList.forEach(student -> System.out.println(student.getName()));
		
	}

}
