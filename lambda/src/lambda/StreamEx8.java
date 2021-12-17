package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class StreamEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> stuList = new ArrayList<Student>();
		stuList.add(new Student("홍길동", 40));
		stuList.add(new Student("장길동", 30));
		stuList.add(new Student("황길동", 50));
		stuList.add(new Student("김길동", 10));
		
		//각 student 객체안에 있는 점수만 리스트형태로 돌려받고싶어요
		List<Integer> stuJumsu = new ArrayList<Integer>();
		
		//Collect : forEach와 동일하게 최종연산에 쓰인다. 원하는 타입으로 출력해줌
		List<Integer> inList =  stuList.stream().map(Student::getJumsu).collect(Collectors.toList());
	
		System.out.println(inList);
	}

}
