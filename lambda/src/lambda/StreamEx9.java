package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������� : forEach, collect, count ,sum,aver,max,min,findFirst....
		
		IntStream stream = Arrays.stream(new int[] {1,2,3,4,5});
		
		//¦���� ����
		//long count=stream.filter(f -> f %2 ==0).count();
		//System.out.println(count);
		
		//¦���� ��
//		long sum=stream.filter(f -> f %2 ==0).sum();
//		System.out.println(sum);
	
		//¦���� ���
//		OptionalDouble sum=stream.filter(f -> f %2 ==0).average();
//		System.out.println(sum);
		
		//¦���� �ִ�,�ּ� max, min
//		OptionalInt sum=stream.filter(f -> f %2 ==0).min();
//		System.out.println(sum);
		
		
		//¦���� ù��° �� ã�� findFirst
		OptionalInt sum=stream.filter(f -> f %2 ==0).findFirst();
		System.out.println(sum);
	}

}
