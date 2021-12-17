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
		stuList.add(new Student("ȫ�浿", 40));
		stuList.add(new Student("��浿", 30));
		stuList.add(new Student("Ȳ�浿", 50));
		stuList.add(new Student("��浿", 10));
		
		//�� student ��ü�ȿ� �ִ� ������ ����Ʈ���·� �����ް�;��
		List<Integer> stuJumsu = new ArrayList<Integer>();
		
		//Collect : forEach�� �����ϰ� �������꿡 ���δ�. ���ϴ� Ÿ������ �������
		List<Integer> inList =  stuList.stream().map(Student::getJumsu).collect(Collectors.toList());
	
		System.out.println(inList);
	}

}
