package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FromCollectionEx2 {

	public static void main(String[] args) {
		List<Student> stuList = new ArrayList<Student>();
		stuList.add(new Student("ȫ�浿", 40));
		stuList.add(new Student("��浿", 30));
		stuList.add(new Student("Ȳ�浿", 50));
		stuList.add(new Student("�̱浿", 10));
		
		stuList.stream().forEach(s->System.out.println(s.getName()+"   "+s.getJumsu()));
		
	}

}
