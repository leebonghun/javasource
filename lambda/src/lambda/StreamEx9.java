package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//최종연산 : forEach, collect, count ,sum,aver,max,min,findFirst....
		
		IntStream stream = Arrays.stream(new int[] {1,2,3,4,5});
		
		//짝수의 개수
		//long count=stream.filter(f -> f %2 ==0).count();
		//System.out.println(count);
		
		//짝수의 합
//		long sum=stream.filter(f -> f %2 ==0).sum();
//		System.out.println(sum);
	
		//짝수의 평균
//		OptionalDouble sum=stream.filter(f -> f %2 ==0).average();
//		System.out.println(sum);
		
		//짝수의 최대,최소 max, min
//		OptionalInt sum=stream.filter(f -> f %2 ==0).min();
//		System.out.println(sum);
		
		
		//짝수의 첫번째 값 찾기 findFirst
		OptionalInt sum=stream.filter(f -> f %2 ==0).findFirst();
		System.out.println(sum);
	}

}
