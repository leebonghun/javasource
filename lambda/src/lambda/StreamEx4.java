package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class StreamEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> stuList = new ArrayList<Student>();
		stuList.add(new Student("ȫ�浿", 40));
		stuList.add(new Student("��浿", 30));
		stuList.add(new Student("Ȳ�浿", 50));
		stuList.add(new Student("��浿", 10));
		
		//�达 ���� ���� ��� ���
//		for(Student stu:stuList) {
//			if(stu.getName().startsWith("��")) {
//				System.out.println(stu.getName());
//			}
//		}
		
		//stuList.stream().filter(s->s.getName().startsWith("��")).forEach(w->System.out.println(w.getName()));
		
		//map * filter * foreach
		stuList.stream().map(stu->stu.getName()).filter(s-> s.startsWith("��")).forEach(System.out::println);
		
		IntStream intStream = IntStream.range(1, 10);
		intStream.filter(s -> s%2==0).forEach(System.out::println); 
			
		
	}

}
