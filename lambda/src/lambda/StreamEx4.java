package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class StreamEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> stuList = new ArrayList<Student>();
		stuList.add(new Student("È«±æµ¿", 40));
		stuList.add(new Student("Àå±æµ¿", 30));
		stuList.add(new Student("È²±æµ¿", 50));
		stuList.add(new Student("±è±æµ¿", 10));
		
		//±è¾¾ ¼ºÀ» °¡Áø »ç¶÷ Ãâ·Â
//		for(Student stu:stuList) {
//			if(stu.getName().startsWith("±è")) {
//				System.out.println(stu.getName());
//			}
//		}
		
		//stuList.stream().filter(s->s.getName().startsWith("±è")).forEach(w->System.out.println(w.getName()));
		
		//map * filter * foreach
		stuList.stream().map(stu->stu.getName()).filter(s-> s.startsWith("±è")).forEach(System.out::println);
		
		IntStream intStream = IntStream.range(1, 10);
		intStream.filter(s -> s%2==0).forEach(System.out::println); 
			
		
	}

}
