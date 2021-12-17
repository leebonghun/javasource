package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class TravelEx1 {

	public static void main(String[] args) {
		List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
		
		customerList.add(new TravelCustomer("이순신", 40, 100000));
		customerList.add(new TravelCustomer("이봉신", 71, 120000));
		customerList.add(new TravelCustomer("이창신", 20, 130000));
		customerList.add(new TravelCustomer("이이신", 30, 104000));
		customerList.add(new TravelCustomer("이조신", 50, 105000));
		
		//고객 명단 출력하기(이름만)
		customerList.stream().map(f ->f.getName()).forEach(System.out::println);
		
		System.out.println();
		//고객들의 총 여행 비용 출력하기

		double sum = customerList.stream().mapToDouble(m -> m.getPrice()).sum();
		System.out.println(sum);
	
		System.out.println();
		//30세 이상 고객명단 출력하기
		customerList.stream().filter(f -> f.getAge()>=30).map(m->m.getName()).sorted().forEach(System.out::println);
	}

}
