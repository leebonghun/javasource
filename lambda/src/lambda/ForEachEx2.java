package lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEachEx2 {

	public static void main(String[] args) {
		List<Student> stuList = new ArrayList<Student>();
		stuList.add(new Student("ȫ�浿", 40));
		stuList.add(new Student("��浿", 30));
		stuList.add(new Student("Ȳ�浿", 50));
		stuList.add(new Student("�̱浿", 10));
		
		for (Student student : stuList) {
			System.out.println(student.getName()+"  "+student.getJumsu());
		}
		
		System.out.println();
		
		stuList.forEach(student -> System.out.println(student.getName()));
		
	}

}
