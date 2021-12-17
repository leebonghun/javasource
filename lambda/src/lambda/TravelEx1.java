package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class TravelEx1 {

	public static void main(String[] args) {
		List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
		
		customerList.add(new TravelCustomer("�̼���", 40, 100000));
		customerList.add(new TravelCustomer("�̺���", 71, 120000));
		customerList.add(new TravelCustomer("��â��", 20, 130000));
		customerList.add(new TravelCustomer("���̽�", 30, 104000));
		customerList.add(new TravelCustomer("������", 50, 105000));
		
		//�� ��� ����ϱ�(�̸���)
		customerList.stream().map(f ->f.getName()).forEach(System.out::println);
		
		System.out.println();
		//������ �� ���� ��� ����ϱ�

		double sum = customerList.stream().mapToDouble(m -> m.getPrice()).sum();
		System.out.println(sum);
	
		System.out.println();
		//30�� �̻� ����� ����ϱ�
		customerList.stream().filter(f -> f.getAge()>=30).map(m->m.getName()).sorted().forEach(System.out::println);
	}

}
